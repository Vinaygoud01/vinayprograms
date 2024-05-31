package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods4 {
	WebDriver driver;

	
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
	  {	
		 driver = new ChromeDriver();
	  }
		else if (browser.equals("edge"))
		{
			 driver = new EdgeDriver();
		}
		else if (browser.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		}
	
	public void enterURL(String url) 
	{
		driver.get(url);
	}

	public void enterData(String locatorType,String locatorvalue,String data)
	{
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

//	public void click(String locatorType, String locatorValue)
//	{
//		if(locatorType.equals("id"))
//		{
//		driver.findElement(By.id(locatorValue)).click();
//		}
//		else if(locatorType.equals("name"))
//		{
//		driver.findElement(By.name(locatorValue)).click();
//		}
//		else if(locatorType.equals("xpath"))
//		{
//		driver.findElement(By.xpath(locatorValue)).click();
//		}
//		else if(locatorType.equals("className"))
//		{
//		driver.findElement(By.className(locatorValue)).click();
//		}
//	}

}
