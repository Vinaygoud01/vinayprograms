package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo1 
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childextentLogger;
	public static ExtentTest parentExtentLogger;
	
	@Test
	public void extentReportsTest()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ADMIN\\Desktop\\selenium framework\\Extends Reports\\Test1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("test1");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		extent.flush();  //Flush method is used to erase any previous data on the report and create a new report.
		System.out.println("done");
		
	}

}
