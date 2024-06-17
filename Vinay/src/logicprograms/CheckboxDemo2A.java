package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo2A 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkbox3G =driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span"));
		WebElement checkboxelementselected = driver.findElement(By.xpath("//input[@id='caddoptional']"));
		boolean checkbox3Gisdisplyed = checkbox3G.isDisplayed();
		System.out.println("checkbox3Gisdisplyed: "+checkbox3Gisdisplyed);
		if(checkbox3Gisdisplyed == true);
		{
			System.out.println(" checkbox3g is displying");
		}
		else
		{
			System.out.println("checkbox3g is  not displying ");  
		}

		boolean checkbox3Gisenabled =  checkbox3G.isEnabled();
		System.out.println("checkbox3Gisenabled :"+checkbox3Gisenabled);

		if(checkbox3Gisenabled == true )
		{
			System.out.println("chechbox3g is enabled");
		}
		else
		{
			System.out.println("checkbox3g is not enabled ");
		}
		
		boolean checkbox3Gisselected = checkboxelementselected.isSelected();
		System.out.println("checkbox3Gisselected:"+checkbox3Gisselected);
		if(checkbox3Gisselected == true )
		{
			System.out.println("checkbox3Gisselected is selected");
		}
		else
		{
			System.out.println("checkbox3Gisselected is not selected ");
		}

		
		boolean checkbox3Gisselected1 = checkboxelementselected.isSelected();
		System.out.println("checkbox3Gisselected1:"+checkbox3Gisselected1);
		if(checkbox3Gisselected1 == true )
		{
			System.out.println("checkbox3Gisselected1 is selected");
		}
		else
		{
			System.out.println("checkbox3Gisselected1 is not selected ");
		}

	}


}

