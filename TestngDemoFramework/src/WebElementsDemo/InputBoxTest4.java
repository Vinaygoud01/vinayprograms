package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InputBoxTest4 {

	@Test
	public void InputBox4()   //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@id='pass']"));
		
		
		boolean InputBoxDisplayed=UserNameInputBox.isDisplayed();
		System.out.println("InputBoxDisplayed :"+InputBoxDisplayed);
		Assert.assertTrue(InputBoxDisplayed);
		System.out.println("inputbox is displaying");
		
//		if(InputBoxDisplayed==true)
//		{
//			System.out.println("input box is displaying");
//		}
//		else
//		{
//			System.out.println("input box is not diplaying");
//		}
		
        boolean InputBoxEnabled=UserNameInputBox.isEnabled();
		System.out.println("InputBoxEnabled: "+InputBoxEnabled);
		Assert.assertTrue(InputBoxEnabled);
	    System.out.println("inputbox is Enabled");
//				
//		if(InputBoxEnabled==true)
//		{
//			System.out.println("input box is Enabled");
//		}
//		else
//		{
//			System.out.println("input box is not Enabled");
//		}
		
		String ActualWaterMarkData=UserNameInputBox.getAttribute("aria-label");
		String ExpectedwaterMarkData ="Password";
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertEquals(ActualWaterMarkData, ExpectedwaterMarkData);
		softAssert2.assertAll();
		System.out.println("WaterMark is displaying correctly");
//		if(ActualWaterMarkData.equals(ExpectedwaterMarkData))
//		{
//			System.out.println("WaterMark is displaying correctly");
//		}
//		else
//		{
//			System.out.println("waterMark is not displaying correctly");
//		}
		
		UserNameInputBox.sendKeys("RBG Technologies");
		String ActualLabelText = UserNameInputBox.getAttribute("value");
		String ExpectedLabelText = "RBG Technologies";
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
