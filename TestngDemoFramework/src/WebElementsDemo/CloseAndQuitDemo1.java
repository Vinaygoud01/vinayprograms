package WebElementsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAndQuitDemo1 
{
	@Test
	public void closeAndQuit1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	//	driver.close();
		driver.quit();
		System.out.println("done");
	}

}
