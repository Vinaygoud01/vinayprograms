package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LabelText1 {

	@Test
	public void text1()   //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement label = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String ActualLabelText = label.getText();
		String ExpectedLabelText = "to continue to Gmail";
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
