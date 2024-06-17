package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkDemo1 
{
	@Test
	public void brokenLinkDemo1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/GOLLA/Downloads/link%20(1).html");
		WebElement links = driver.findElement(By.tagName("a"));
		String linkAttribute = links.getAttribute("herf");
		                                 
		if(linkAttribute.equals("links")) 
		{
			System.out.println("link is not working");
		}
		else
		{
		    System.out.println("link is  working");	
		}
		
	}

}
