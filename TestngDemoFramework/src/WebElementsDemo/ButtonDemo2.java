package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonDemo2 {

	@Test
	public void button2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		driver.switchTo().frame(0);
		WebElement Button=driver.findElement(By.xpath("(//input[@value='A submit button'])[2]"));
	
		boolean ButtonDisplayed=Button.isDisplayed();
		System.out.println("ButtonDisplayed :" +ButtonDisplayed);
		Assert.assertTrue(ButtonDisplayed);
		System.out.println("Button is displaying");
		
//		if(ButtonDisplayed==true)
//		{
//			System.out.println("Button is displaying");
//		}
//		else
//		{
//			System.out.println("button is not displaying");
//		}
		boolean ButtonEnabled=Button.isEnabled();
		System.out.println("ButtonEnabled :" +ButtonEnabled);
		Assert.assertTrue(ButtonEnabled);
		System.out.println("Button is enable");

		
//		if(ButtonEnabled==true)
//		{
//			System.out.println("Button is enable");
//		}
//		else
//		{
//			System.out.println("button is not enabled");
//		}
//		
		String ButtonName1=Button.getAccessibleName();
		System.out.println("ButtonName :"+ButtonName1);
		String ExpectedButtonName="A submit button";
		Assert.assertEquals(ButtonName1, ExpectedButtonName);
//		if(ButtonName1.equals(ExpectedButtonName))
//		{
//			System.out.println("Data is matching");
//		}
//		else
//		{
//			System.out.println("data is not matched");
//		}
		Button.click();
		
		}
		
		

	}


