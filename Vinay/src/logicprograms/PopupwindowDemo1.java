package errorprograms;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class PopupwindowDemo1
{

	@Test
	public void popupwindowDemo1() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		WebElement learnmore = driver.findElement(By.xpath("//a[ text() = 'Learn more']"));
		learnmore.click();

		Set<String> windowIds =  driver.getWindowHandles();
		Iterator<String> windowsList = windowIds.iterator();
		String parentwindowId = windowsList.next();
		String childwindowId = windowsList.next();
		
		
		WebElement labeldata = driver.findElement(By.xpath("//[ text()='Browse Chrome as a guest']"));
                                                            
		String actualtext = labeldata.getText();
		System.out.println(actualtext);
		



	}
}
