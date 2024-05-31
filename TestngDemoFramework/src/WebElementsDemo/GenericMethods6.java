package WebElementsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods6 {
	WebDriver driver;
	
	
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
	

//	public void enterData(String locatorType,String locatorvalue,String data) throws IOException
//	{
//		FileInputStream finput=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\Test1.properties");  
//		Properties p1=new Properties();
//		p1.load(finput);   
//		String data1=p1.getProperty("BrowserName");
//		if(locatorType.equals("id"))
//		{
//		driver.findElement(By.id(locatorvalue)).sendKeys(data1);
//		}
//		else if(locatorType.equals("name"))
//		{
//		driver.findElement(By.name(locatorvalue)).sendKeys(data1);
//		}
//		else if(locatorType.equals("xpath"))
//		{
//		driver.findElement(By.xpath(locatorvalue)).sendKeys(data1);
//		}
//		else if(locatorType.equals("className"))
//		{
//		driver.findElement(By.className(locatorvalue)).sendKeys(data1);
//		}
//		else if(locatorType.equals("cssSelector"))
//		{
//		driver.findElement(By.cssSelector(locatorvalue)).sendKeys(data1);
//		}
//		}
//	
	


}
