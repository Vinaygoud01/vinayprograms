package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlerttDemoAssignment
{
	@Test
	public void AlertassignmentClick1() throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		WebElement firstButton = driver.findElement(By.xpath("//button[@id='alertBox']"));
		firstButton.click();
		Thread.sleep(4000);
	//	driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		
		WebElement AlertText = driver.findElement(By.xpath("//div[@id='output']"));
		String DisplayedAlretText=AlertText.getText();
		System.out.println("DisplayedAlretText: "+DisplayedAlretText);
		
		
	
	}

}
