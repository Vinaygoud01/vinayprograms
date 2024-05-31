package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector 
{
	@Test
	public void css()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement UserNameInputBoxstartwith = driver.findElement(By.xpath("//input[starts-with(@type,'email')]"));
		WebElement UserNameInputBoxcontains = driver.findElement(By.xpath("//input[contains(@id,'tifier')]"));
		WebElement UserNameInputBoxendswith = driver.findElement(By.xpath("//input[starts-with(@type,'email')]"));
	}

}
