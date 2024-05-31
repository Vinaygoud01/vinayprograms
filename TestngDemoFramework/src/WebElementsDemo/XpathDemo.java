package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathDemo
{
	@Test
	public void Xpath()
	{
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 WebElement link=driver.findElement(By.xpath("//button[@name='login']"));
	 link.click();
		
		
	}
		

}
