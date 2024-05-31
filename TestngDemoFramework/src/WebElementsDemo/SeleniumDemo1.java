package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo1 {

@Test
public void Selenium1()
{
		
		WebDriver driver =new ChromeDriver();
		 driver.get("http://gmail.com");
		driver.findElement(By.xpath("//span[text()='Use your Google Account']")).getText();
		 
	

	}

}
