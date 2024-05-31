package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo1
{
	@Test
	public void MouseOver()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement mouseover = driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		Actions act=new Actions(driver);  
		act.moveToElement(mouseover).perform();
//		act.contextClick();  //for right click
		WebElement clicklink = driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]"));
		clicklink.click();


	}

}
