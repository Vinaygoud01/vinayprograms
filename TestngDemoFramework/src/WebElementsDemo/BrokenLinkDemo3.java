package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkDemo3 {

	@Test
	public void brokenlink3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/BrokenLink1.html");
		WebElement link1= driver.findElement(By.tagName("a"));
		String linkname=link1.getAttribute("href");
		Assert.assertNotEquals(linkname, "");
		System.out.println("link is fine");
//
//		if(linkname.equals(""))
//		{
//			System.out.println("link is broken");
//		}
//		else
//		{
//			System.out.println("link is working fine");
//		}

	}

}
