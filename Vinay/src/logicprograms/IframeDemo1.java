package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeDemo1 
{
	@Test
	public void iframeDemo1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		driver.switchTo().frame(1);

		WebElement label2 =driver.findElement(By.xpath("//a[@id='Blog1']/div[1]/div/h2/span"));
		                                      
		String actualLabeldata =label2.getText();
		System.out.println("actualLabeldata:"+actualLabeldata);
		String  excpectedLabeldata="Saturday, 3 January 2015";
		
		Assert.assertNotEquals(actualLabeldata, excpectedLabeldata);
		driver.switchTo();
		WebElement inputbox =driver.findElement(By.xpath("//input[@name='Town']"));
		inputbox.sendKeys("hydrabad");
		System.out.println("done");
		
		
	}

}
