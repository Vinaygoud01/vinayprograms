package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxTest2B {

	@Test
	public void checkbox2B()  //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement CheckBoxforDisplayClick = driver.findElement(By.xpath("//*[@id='content']/div[4]/div/form/table/tbody/tr[6]/td/label/span"));
		WebElement CheckBoxForisSelect = driver.findElement(By.xpath("//*[@id=\"caddoptional\"]"));
		
		boolean CheckBoxDisplayed=CheckBoxforDisplayClick.isDisplayed();
		System.out.println("CheckBoxDisplayed :" +CheckBoxDisplayed);
		Assert.assertTrue(CheckBoxDisplayed);
		System.out.println("CheckBox is displaying");
//		if(CheckBoxDisplayed==true)
//		{
//			System.out.println("CheckBox is displaying");
//		}
//		else
//		{
//			System.out.println("CheckBox is not displaying");
//		}
		boolean CheckBoxEnabled=CheckBoxforDisplayClick.isEnabled();
		System.out.println("CheckBoxEnabled :" +CheckBoxEnabled);
		Assert.assertTrue(CheckBoxEnabled);
		System.out.println("CheckBox is Enabled");
//		if(CheckBoxEnabled==true)
//		{
//			System.out.println("CheckBox is Enabled");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Enabled");
//		}
		
		boolean CheckBoxSelected=CheckBoxForisSelect.isSelected();
		System.out.println("CheckBoxSelected :" +CheckBoxSelected);
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertTrue(true);
		softAssert2.assertAll();
		System.out.println("CheckBox is Selected");
		
//		if(CheckBoxSelected==true)
//		{
//			System.out.println("CheckBox is Selected");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Selected");
//		}
		
		CheckBoxforDisplayClick.click();
		System.out.println("clicked on checkbox");
		
		
		boolean CheckBoxSelectedAfter=CheckBoxForisSelect.isSelected();
		System.out.println("CheckBoxSelected :" +CheckBoxSelectedAfter);
		SoftAssert softAssert3 = new SoftAssert();
		softAssert3.assertTrue(true);
		softAssert3.assertAll();
		System.out.println("CheckBox is Selected");

//		if(CheckBoxSelectedAfter==true)
//		{
//			System.out.println("CheckBox is Selected");
//		}
//		else
//		{
//			System.out.println("CheckBox is not Selected");
//		}
//	
	
	

	}

}
