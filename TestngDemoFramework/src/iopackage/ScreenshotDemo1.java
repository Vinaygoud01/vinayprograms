package iopackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo1
{
	@Test
	public void ScreenshotTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File filesource=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File target =new File("C://Users//ADMIN//Desktop//selenium framework//screenshots//screen1.png");
		FileUtils.copyFile(filesource, target);
		System.out.println("done");
	}

}
