package iopackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo2
{
	@Test
	public void ScreenshotTest() throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		File filesource=driver.getScreenshotAs(OutputType.FILE);
		File target =new File("C://Users//ADMIN//Desktop//selenium framework//screenshots//screen2.png");
		FileUtils.copyFile(filesource, target);
		System.out.println("done");
	}

}
