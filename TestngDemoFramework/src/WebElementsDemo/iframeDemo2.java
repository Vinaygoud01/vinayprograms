package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframeDemo2 {

	@Test
	public void iframe2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/Iframe1%20(1).html");
		driver.switchTo().frame(0);    //the data what we are expecting is in other frame so using frame index 2 times   //examplw for methodoverloading
		driver.switchTo().frame(0);       //examplw for methodoverloading
		

		WebElement label = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String ActualLabelText = label.getText();
		String ExpectedLabelText = "Saturday 3 January 2015";
		      

		if (ActualLabelText.equals(ExpectedLabelText)) 
		{
			System.out.println("data is Matching");
		} 
		else
		{
			System.out.println("data is not Matching");
		
		}
		driver.switchTo().parentFrame();
	    WebElement inputbox = driver.findElement(By.xpath("//input[@id='text1' and @name='Town']"));
		inputbox.sendKeys("hyderabad");
		
	
		

	}

}
