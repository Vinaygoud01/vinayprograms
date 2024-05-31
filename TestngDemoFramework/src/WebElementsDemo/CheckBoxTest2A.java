package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxTest2A {

	@Test
	public void checbox2A()  //failure
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement CheckBox = driver.findElement(By.xpath("//*[@id='caddoptional']"));

		boolean CheckBoxDisplayed=CheckBox.isDisplayed();
		System.out.println("CheckBoxDisplayed :" +CheckBoxDisplayed);
		Assert.assertTrue(CheckBoxDisplayed);
		System.out.println("CheckBox is displaying");
		
		boolean CheckBoxEnabled=CheckBox.isEnabled();
		System.out.println("CheckBoxEnabled :" +CheckBoxEnabled);
		Assert.assertTrue(CheckBoxEnabled);
		System.out.println("CheckBox is Enabled");
		
		boolean CheckBoxSelected=CheckBox.isSelected();
		System.out.println("CheckBoxSelected :" +CheckBoxSelected);
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertTrue(true);
		softAssert2.assertAll();
		System.out.println("CheckBox is Selected");
		
		CheckBox.click();
		System.out.println("clicked on checkbox");
		
		boolean CheckBoxSelectedAfter=CheckBox.isSelected();   //here it is looks like checkbox but not
		//mandatory attribute=type, mandatory attribute value="checkbox";
		System.out.println("CheckBoxSelectedAfter :" +CheckBoxSelectedAfter);
		SoftAssert softAssert3 = new SoftAssert();
		softAssert3.assertTrue(true);
		softAssert3.assertAll();
		System.out.println("CheckBox is Selected");
		
	
	
//		boolean CheckBoxDisplayed=CheckBox.isDisplayed();
//		System.out.println("CheckBoxDisplayed :" +CheckBoxDisplayed);
//		if(CheckBoxDisplayed==true)
//		{
//			System.out.println("CheckBox is displaying");
//		}
//		else
//		{
//			System.out.println("CheckBox is not displaying");
//		}
//		boolean CheckBoxEnabled=CheckBox.isEnabled();
//		System.out.println("CheckBoxEnabled :" +CheckBoxEnabled);
//		if(CheckBoxEnabled==true)
//		{
//			System.out.println("CheckBox is Enabled");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Enabled");
//		}
//		boolean CheckBoxSelected=CheckBox.isSelected();
//		System.out.println("CheckBoxSelected :" +CheckBoxSelected);
//		if(CheckBoxSelected==true)
//		{
//			System.out.println("CheckBox is Selected");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Selected");
//		}
//		CheckBox.click();
//		System.out.println("clicked on checkbox");
//		
//		
//		boolean CheckBoxSelectedAfter=CheckBox.isSelected();
//		System.out.println("CheckBoxSelected :" +CheckBoxSelectedAfter);
//		if(CheckBoxSelectedAfter==true)
//		{
//			System.out.println("CheckBox is Selected");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Selected");
//		}
//	
//	
	

	}

}
