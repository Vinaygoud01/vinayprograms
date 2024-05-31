package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods {
	WebDriver driver;

	public void openBrowser(String browser)
	{ 
		switch(browser)
		{
		case "chrome": 
		driver = new ChromeDriver();
		break;
		case "edge":
		driver = new EdgeDriver();
		break;
		case "firefox":
		 driver = new FirefoxDriver();
		break;
		default:
	    System.out.println("please enter correct browser name");
	    }
	}
	
	public void enterURL(String url) 
	{
		driver.get(url);
	}
	public void enterData(String locatorType,String locatorvalue,String data)
	{
		switch(locatorType)
		{
		case "id":
		driver.findElement(By.id(locatorvalue)).sendKeys(data);
		break;
		case "classname":
		driver.findElement(By.name(locatorvalue)).sendKeys(data);
		break;
		case "xpath":
		driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
		break;
		default:
			System.out.println("please enter the correct data");
		}
	}
	public void click(String locatorType, String locatorValue)
	{
		switch(locatorType)
		{
		case "id":
		driver.findElement(By.id(locatorValue)).click();;
		break;
		case "classname":
		driver.findElement(By.name(locatorValue)).click();;
		break;
		case "xpath":
		driver.findElement(By.xpath(locatorValue)).click();;
		break;
		default:
			System.out.println("please enter the correct data ");
		}

	}

}
