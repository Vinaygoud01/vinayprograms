package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo1 {

	@Test
	public void RadioButton1()  //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement RadioButtonClick = driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
	
		boolean RadioButtonDisplayed=RadioButtonClick.isDisplayed();
		System.out.println("RadioButtonDisplayed :" +RadioButtonDisplayed);
		Assert.assertTrue(RadioButtonDisplayed);
		System.out.println("RadioButton is displaying");
		
//		if(RadioButtonDisplayed==true)
//		{
//			System.out.println("RadioButton is displaying");
//		}
//		else
//		{
//			System.out.println("RadioButton is not displaying");
//		}
		
		boolean RadioButtonEnabled=RadioButtonClick.isEnabled();
		System.out.println("RadioButtonEnabled :" +RadioButtonEnabled);
		Assert.assertTrue(RadioButtonEnabled);
		System.out.println("RadioButton is not enable");
//		if(RadioButtonEnabled==true)
//		{
//			System.out.println("RadioButton is Enabled");
//		}
//		else
//		{
//			System.out.println("RadioButton is not Enabled");
//		}
		
		boolean RadioButtonSelected=RadioButtonClick.isSelected();
		System.out.println("RadioButtonSelected :" +RadioButtonSelected);
		Assert.assertTrue(true);
		System.out.println("RadioButton is Selected");
		
//		if(RadioButtonSelected==true)
//		{
//			System.out.println("RadioButton is Selected");
//		}
//		else
//		{
//			System.out.println("RadioButton is not Selected");
//		}
		
		RadioButtonClick.click();
		System.out.println("clicked on checkbox");
		
		
		boolean RadioButtonSelectedAfter=RadioButtonClick.isSelected();
		System.out.println("RadioButtonSelectedAfter :" +RadioButtonSelectedAfter);
		Assert.assertTrue(true);
		System.out.println("RadioButton is Selected");
//		if(RadioButtonSelectedAfter==true)
//		{
//			System.out.println("RadioButton is Selected");
//		}
//		else
//		{
//			System.out.println("RadioButton is not Selected");
//		}
	
	}

}
