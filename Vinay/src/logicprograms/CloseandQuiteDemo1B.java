package errorprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuiteDemo1B 
{
	@Test
	public void closeandQuiteDemo1A() throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		WebElement learnmore = driver.findElement(By.xpath("//span[text() = 'Learn more']"));
		learnmore.click();
		Set<String> windowIds =  driver.getWindowHandles();
		Iterator<String> windowsList = windowIds.iterator();
		String parentwindowId = windowsList.next();
		String childwindowId = windowsList.next();
		
		driver.switchTo().window("");
	
		Thread.sleep(5000);
		driver.close();
		System.out.println("done");
	}

}
