package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo4 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childextentLogger;
	public static ExtentTest parentExtentLogger;
	
	@Test
	public void extentReportsTest()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ADMIN\\Desktop\\selenium framework\\Extends Reports\\Test4.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("test1");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		childextentLogger.log(Status.FAIL,MarkupHelper.createLabel(" - Test Case failed", ExtentColor.RED));
		
		childextentLogger = parentExtentLogger.createNode("Scenario2");
		childextentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case Skipped", ExtentColor.GREY));
		
		parentExtentLogger = extent.createTest("test2");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		
		childextentLogger = parentExtentLogger.createNode("Scenario2");
		childextentLogger.log(Status.SKIP,MarkupHelper.createLabel(" - Test Case skipped", ExtentColor.GREY));
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));


		extent.flush();
		System.out.println("done");
		
	}

}
