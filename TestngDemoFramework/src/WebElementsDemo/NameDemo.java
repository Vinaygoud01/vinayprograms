package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameDemo {

	@Test
	public void name()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("vinay");
	

	}

}
