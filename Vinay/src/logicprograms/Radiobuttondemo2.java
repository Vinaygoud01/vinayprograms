package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttondEmo2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radiobutton =driver.findElement(By.xpath("//input[@class='tripType' and @value='oneway']"));
		
		boolean radiobuttonisdisplayed = radiobutton.isDisplayed();
		System.out.println("radiobuttonisdisplayed"+radiobuttonisdisplayed);
		if(radiobuttonisdisplayed == true)
		{
			System.out.println(" radiobutton is displying");
		}
		else
		{
			System.out.println("radiobutton is  not displying ");  
		}

		boolean radiobuttonisenabled =  radiobutton.isEnabled();
		System.out.println("radiobuttonisenabled:"+radiobuttonisenabled);

		if(radiobuttonisenabled == true )
		{
			System.out.println("radiobutton is enabled");
		}
		else
		{
			System.out.println("radiobutton is not enabled ");
		}
		
		boolean radiobuttonisselected = radiobutton.isSelected();
		System.out.println("radiobuttonisselected:"+radiobuttonisselected);
		if(radiobuttonisselected =- true )
		{
			System.out.println("radiobuttonisselected is selected");
		}
		else
		{
			System.out.println("radiobuttonisselected is not selected ");
		}

		radiobutton.clear();
		boolean radiobuttonisselected1 = radiobutton.isSelected();
		System.out.println("radiobuttonisselected:"+radiobuttonisselected1);
		if(radiobuttonisselected1 == true )
		{
			System.out.println("radiobuttonisselected is selected");
		}
		else
		{
			System.out.println("radiobuttonisselected is not selected ");
		}

	}






	}


