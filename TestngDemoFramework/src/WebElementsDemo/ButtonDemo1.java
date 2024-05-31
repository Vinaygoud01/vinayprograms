package WebElementsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ButtonDemo1
{
	@Test
	public void button1()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Button=driver.findElement(By.xpath("//button[@name='login']"));
		
		boolean ButtonDisplayed=Button.isDisplayed();
		System.out.println("ButtonDisplayed :" +ButtonDisplayed);
		Assert.assertTrue(ButtonDisplayed);
		System.out.println("Button is displaying");

		boolean ButtonEnabled=Button.isEnabled();
		System.out.println("ButtonEnabled :" +ButtonEnabled);
		Assert.assertTrue(ButtonEnabled);
		System.out.println("Button is enable");
		
		String ButtonName=Button.getText();
		System.out.println("ButtonName :"+ButtonName);
		String ExpectedButtonName="Log in";
		Assert.assertEquals(ButtonName, ExpectedButtonName);
		
		System.out.println("Button name displayed successfully");

		Button.click();
		
		}

}

