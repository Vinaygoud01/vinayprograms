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

public class ExtentReportsWithSelenium2 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childextentLogger;
	public static ExtentTest parentExtentLogger;
	
	@Test
	public void ExtentReportsWithSeleniumTest() throws IOException
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ADMIN\\Desktop\\selenium framework\\Extends Reports\\extentReportsWithSelenium2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("test1");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("https://www.incometax.gov.in/iec/foportal/themes/custom/itdbase/logo.svg").build());
		extent.flush();
		System.out.println("done");
		
	}

}
