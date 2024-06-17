package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuiteDemo1A 
{
	@Test
	public void closeandQuiteDemo1A() throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		WebElement learnmore = driver.findElement(By.xpath("//div[text() = 'Learn more']"));
		learnmore.click();                 
		Thread.sleep(5000);
		driver.close();
		System.out.println("done");
	}

}
