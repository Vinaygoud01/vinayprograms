package WebElementsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTitleDemo1
{
	@Test
	public void pagetitle()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		String title = driver.getTitle();
		System.out.println("Expected Title: "+title);
	}

}
