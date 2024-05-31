package WebElementsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip
{
		
	    public static void main(String[] args) {
	        // Set the path to ChromeDriver
	      //  System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage
	        driver.get("https://demoqa.com/tool-tips");

	        // Find the element that has the tooltip
	        WebElement element = driver.findElement(By.xpath("//button[.='Hover me to see']"));

	        // Create an instance of Actions class
	        Actions actions = new Actions(driver);

	        // Hover over the element to trigger the tooltip
	        actions.moveToElement(element).perform();

	        // Wait for the tooltip to appear
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='arrow']//following-sibling::div[.='You hovered over the Button']")));

	        // Get the text of the tooltip
	        String tooltipText = tooltip.getText();

	        // Verify the tooltip content
	        String expectedText = "You hovered over the Button";
	        if (tooltipText.contains(expectedText)) {
	            System.out.println("Tooltip verification successful!");
	        } else {
	            System.out.println("Tooltip verification failed!");
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


