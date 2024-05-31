package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2 
{
	@Test
	public void closeAndQuit2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement linkText = driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
		linkText.click();
		driver.close();   //closes the parent window
	//	driver.quit();   //completly closes the browser
		System.out.println("done");
	}
}
