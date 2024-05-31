package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialLinkDemo {

	@Test
	public void  PartialLink()
	{
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		WebElement link =driver.findElement(By.partialLinkText("Forgotten "));   //we have given half text only
		link.click();
		
		

	}

}
