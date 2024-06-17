package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkDemo2 
{
	@Test
	public void brokenLinkDemo2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/GOLLA/Downloads/link2%20(1).html");
		WebElement linkes = driver.findElement(By.name("a"));
		String linkAttribute = linkes.getAttribute("herf");
		if(linkAttribute.equals(""))
		{
			System.out.println("link is  working");
		}
		else
		{
		System.out.println("link is not working");	
		};
		
	}

}
