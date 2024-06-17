package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleDemo1 
{
	@Test
	public  void pageTitleDemo1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		String expcetedtitle="Find a Flight Mercury Tours";

        WebElement title = driver.findElement(By.xpath("//title[ text() = 'Find a Flight: Mercury Tours: ']"));
		String actualtitle =driver.getTitle()
		

		Assert.assertEquals(actualtitle, expcetedtitle);
		System.out.println("actualtitle "+actualtitle);
	}

}
