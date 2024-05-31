package WebElementsDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenericMethods8 {
	WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childextentLogger;
	public static ExtentTest parentExtentLogger;

	
	public void openBrowser() throws IOException
	{
		FileInputStream finput=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\Test1.properties");  
		Properties p1=new Properties();
		p1.load(finput);   
		String data1=p1.getProperty("BrowserName");
		if(data1.equals("chrome"))
	  {	
		 driver = new ChromeDriver();
	  }
		else if (data1.equals("edge"))
		{
			 driver = new EdgeDriver();
		}
		else if (data1.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		}
	
	public void enterURL() throws IOException 
	{
		FileInputStream finput=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\Test1.properties");  
		Properties p1=new Properties();
		p1.load(finput);   
		String data2=p1.getProperty("URL");
		driver.get(data2);
	}
	

	public void enterData(String locatorType,String locatorvalue,String data) 
	{
		driver.manage().window().maximize();
		if(locatorType.equals("id"))
		{
		driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}
		else if(locatorType.equals("name"))
		{
		driver.findElement(By.name(locatorvalue)).sendKeys(data);
		}
		else if(locatorType.equals("xpath"))
		{
		driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		}
		else if(locatorType.equals("className"))
		{
		driver.findElement(By.className(locatorvalue)).sendKeys(data);
		}
		else if(locatorType.equals("cssSelector"))
		{
		driver.findElement(By.cssSelector(locatorvalue)).sendKeys(data);
		}
		
	}
	public void click(String locatorType, String locatorValue)
	{
		if(locatorType.equals("id"))
		{
		driver.findElement(By.id(locatorValue)).click();
		}
		else if(locatorType.equals("name"))
		{
		driver.findElement(By.name(locatorValue)).click();
		}
		else if(locatorType.equals("xpath"))
		{
		driver.findElement(By.xpath(locatorValue)).click();
		}
		else if(locatorType.equals("className"))
		{
		driver.findElement(By.className(locatorValue)).click();
		}
	}
	public void takeScreenShot(String filename) throws IOException
	{
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File filesource=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File target =new File("C://Users//ADMIN//Desktop//selenium framework//screenshots//"+filename+".png");
		FileUtils.copyFile(filesource, target);
		System.out.println("done");
	}
	public void extentReportsTest() throws IOException
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\ADMIN\\Desktop\\selenium framework\\Extends Reports\\OrangHRM_Login_Case.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("OrangHRM_Login_Case");
		childextentLogger = parentExtentLogger.createNode("Scenario1");
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" -URL passed", ExtentColor.GREEN));
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C://Users//ADMIN//Desktop//selenium framework//screenshots//file1.png").build());
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" -UserNameData passed", ExtentColor.GREEN));
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C://Users//ADMIN//Desktop//selenium framework//screenshots//file2.png").build());
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" -PassworData passed", ExtentColor.GREEN));
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C://Users//ADMIN//Desktop//selenium framework//screenshots//file3.png").build());
		
		childextentLogger.log(Status.PASS,MarkupHelper.createLabel(" -Login passed", ExtentColor.GREEN));
		childextentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C://Users//ADMIN//Desktop//selenium framework//screenshots//file4.png").build());

		
		extent.flush();
		System.out.println("done");
		
	}
	
	


}
