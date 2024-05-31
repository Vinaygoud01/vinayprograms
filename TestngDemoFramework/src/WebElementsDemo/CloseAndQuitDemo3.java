package WebElementsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo3
{
	@Test
	public void CloseAndQuit3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement linkText = driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
		linkText.click();

		Set<String> windowsId = driver.getWindowHandles(); 
		Iterator<String> windowslist = windowsId.iterator();
		String parentWindowId = windowslist.next();  //this code is for single parent and single child window
		String childWindowId = windowslist.next();   //for multiple windows it wont work
		driver.switchTo().window(childWindowId);

		driver.close();   //child window is closed
	//	driver.quit();  //completely closes the browser
		System.out.println("done");
	}
}
