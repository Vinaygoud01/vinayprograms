package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputBoxTest5 {

	@Test
	public void InputBox5()  //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@name='userName']"));
		boolean InputBoxDisplayed=UserNameInputBox.isDisplayed();
		System.out.println("InputBoxDisplayed :"+InputBoxDisplayed);
		Assert.assertTrue(InputBoxDisplayed);
		System.out.println("inputbox is displaying");
		
//		
//		if(InputBoxDisplayed==true)
//		{
//			System.out.println("input box is displaying");
//		}
//		else
//		{
//			System.out.println("input box is not diplaying");
//		}
//		
        boolean InputBoxEnabled=UserNameInputBox.isEnabled();
		System.out.println("InputBoxEnabled: "+InputBoxEnabled);
		Assert.assertTrue(InputBoxEnabled);
	    System.out.println("inputbox is Enabled");

//		if(InputBoxEnabled==true)
//		{
//			System.out.println("input box is Enabled");
//		}
//		else
//		{
//			System.out.println("input box is not Enabled");
//		}
		
		UserNameInputBox.sendKeys("RBG");
		String ActualLabelText = UserNameInputBox.getAttribute("value");
		String ExpectedLabelText = "RBG";
		Assert.assertEquals(ActualLabelText, ExpectedLabelText);
		System.out.println("data is Matching");
//		if (ActualLabelText.equals(ExpectedLabelText)) 
//		{
//			System.out.println("data is Matching");
//		} 
//		else
//		{
//			System.out.println("data is not Matching");
//		}
//      
		
		
		




	}

}
