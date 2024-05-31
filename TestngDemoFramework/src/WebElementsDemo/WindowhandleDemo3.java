package WebElementsDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowhandleDemo3 
{
	@Test
	public void Windowhandle3()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#");
		
		WebElement multipleWindowsButton = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		multipleWindowsButton.click();
		
//		Set<String> windowsId = driver.getWindowHandles(); 
//		Iterator<String> windowslist = windowsId.iterator();
//		String parentWindowId = windowslist.next();
//		String parentWindowId2 = windowslist.next();
//		String parentWindowId3 = windowslist.next();
//		
//		driver.switchTo().window(parentWindowId3);
//		
//		String title = driver.getTitle();
//		System.out.println("Expected Title: "+title);
		
	//	String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
	
		for(String handle:s)
		{
			
		
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			System.out.println("Expected Title: "+title);
			if(driver.getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
			{
				
				boolean a = driver.findElement(By.id("firstName")).isDisplayed();
	
				System.out.println(a);
			}
			else{
				
				driver.close();
			}


		}
	}
}