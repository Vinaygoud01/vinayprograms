package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods3 {
	WebDriver driver;

	public void openBrowser(String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
	}

	public void enterURL(String url) {
		driver.get(url);
	}

	public void selectDropDown(String locatorType, String locatorvalue, String data, int data1) {
		if (locatorType.equals("id")) {
			WebElement Arrivingin = driver.findElement(By.id(locatorvalue));
			Select s1 = new Select(Arrivingin);
			s1.selectByVisibleText(data);
			s1.selectByIndex(data1);

		} else if (locatorType.equals("name")) {
			WebElement Arrivingin = driver.findElement(By.name(locatorvalue));
			Select s1 = new Select(Arrivingin);
			s1.selectByVisibleText(data);
			s1.selectByIndex(data1);

		} else if (locatorType.equals("xpath")) {
			WebElement Arrivingin = driver.findElement(By.xpath(locatorvalue));
			Select s1 = new Select(Arrivingin);
			s1.selectByVisibleText(data);
			s1.selectByIndex(data1);
			s1.selectByIndex(data1);

		} else if (locatorType.equals("className")) {
			WebElement Arrivingin = driver.findElement(By.className(locatorvalue));
			Select s1 = new Select(Arrivingin);
			s1.selectByVisibleText(data);
			s1.selectByIndex(data1);

		}
	}

}
