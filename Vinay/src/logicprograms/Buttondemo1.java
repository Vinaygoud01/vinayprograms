package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttondemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement button =driver.findElement(By.linkText("//button[@id='loginbutton']"));
                                  

		boolean buttonisdisplyed =  button.isDisplayed();
		System.out.println("buttonisdisplyed :"+buttonisdisplyed);
		if(buttonisdisplyed == true)
		{
			System.out.println(" button is displying");
		}
		else
		{
			System.out.println("button is  not displying ");  
		}

		boolean buttonisenabled =  button.isEnabled();

		System.out.println("buttonisenabled :"+ buttonisenabled);

		if(buttonisenabled == true )
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled ");
		}

		String actualloginbutton = button.getAttribute("");
		String expectedloginbutton = "Log In";

		if (actualloginbutton.equals(expectedloginbutton))
		{
			System.out.println("login name is correct");
		}
		else 
		{
			System.out.println("login name is not correct");
		}

		WebElement login =  driver.findElement(By.name("login"));
		login.click();
	}




}


