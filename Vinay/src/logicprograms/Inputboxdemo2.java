package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Inputboxdemo2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://gmail.com");
		WebElement usernameinputbox =driver.findElement(By.xpath("//input[@id='identifierId']"));

		boolean inputboxisdisplyed = usernameinputbox.isDisplayed();
		System.out.println("inputboxisdisplyed: "+inputboxisdisplyed);

		if(inputboxisdisplyed == true)
		{
			System.out.println(" inputbox is displying");
		}
		else
		{
			System.out.println("inputbox is  not displying ");  
		}

		boolean inputboxisenabled =  usernameinputbox.isEnabled();

		System.out.println("inputboxisenabled :"+inputboxisenabled);

		if(inputboxisenabled == true )
		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled ");
		}
		String actualwatermark = usernameinputbox.getAttribute("place-holder");
		System.out.println("actualwatermark :"+actualwatermark);

		String expectedwatermark = "Email or phone";
		if(actualwatermark.equals(expectedwatermark))
		{
			System.out.println(" watermarkes is displying as expected");
		}
		else
		{
			System.out.println("watermarkes is not displying as expected");
		}
		usernameinputbox.sendKeys("Rbg technologies");
		String actualenterdata = usernameinputbox.getAttribute("value");
		System.out.println("actualenterdata :"+ actualenterdata);

		if(actualenterdata.equals(Rbg technologies))
		{
			System.out.println("data entered successfully");
		}
		else
		{
			System.out.println("data entered not successfully");
		}
	}

}
