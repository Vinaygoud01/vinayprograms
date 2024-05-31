package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraLogin 
{
	@Test
	public void myntra() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=dms_google");
////a[text()='login / Signup']
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
		Actions act = new Actions(driver);
		act.moveToElement(profile).perform();

		Thread.sleep(4000);
		WebElement login = driver.findElement(By.xpath("//a[text()='login / Signup']"));
		login.click();

	}

}
