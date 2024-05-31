package reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithSelenium 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childextentLogger;
	public static ExtentTest parentExtentLogger;
	
	@Test
	public void ExtentReportsWithSeleniumTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File filesource=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File target =new File("C://Users//ADMIN//Desktop//selenium framework//screenshots//screen1.png");
		FileUtils.copyFile(filesource, target);
	
	
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ADMIN\\Desktop\\selenium framework\\Extends Reports\\extentReportsWithSelenium.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("test1");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C://Users//ADMIN//Desktop//selenium framework//screenshots//screen1.png").build());
		extent.flush();
		System.out.println("done");
		
	}

}
