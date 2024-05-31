package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextDemo {

	@Test
	public void linktext()
	{
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement link=driver.findElement(By.linkText("Forgotten password?"));  //xpath last words 
		 link.click();

	}

}
