package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderDemo1 
{
	@Test
	public void slider()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		WebElement mouseover = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		Actions act=new Actions(driver);  
		act.moveToElement(mouseover).perform();
	}

}
