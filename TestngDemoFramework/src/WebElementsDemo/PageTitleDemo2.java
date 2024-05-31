package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTitleDemo2
{
	@Test
	public void pagetitle2() throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@name='userName']"));;
		UserNameInputBox.sendKeys(" ");
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));;
		UserNameInputBox.sendKeys(" ");
		
		WebElement Button=driver.findElement(By.xpath("//input[@name='submit']"));
		Thread.sleep(4000);
		Button.click();
		
		String title = driver.getTitle();
		System.out.println("Expected Title: "+title);
	}

}
