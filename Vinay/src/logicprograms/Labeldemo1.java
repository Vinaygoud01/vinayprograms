package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labeldemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");            
		WebElement label=driver.findElement(By.xpath("//div[text()='to continue to Gmail']"));
		String actuallabeltext = label.getText("");
		String expectedlabeltext = "to continue to Gmail";

		if(actuallabeltext.equals(expectedlabeltext))
		{
			System.out.println("label is matching");
		}

		else
		{
			System.out.println("label is not matching");
		}

	}

}
