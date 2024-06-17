package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MosuseHoverDemo1 
{
	@Test
	public void mosuseHoverDemo1() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().minimize();
		
		WebElement  mousehover = driver.findElement(By.xpath("//a[text()='EN']"));
                                                       
		Actions act = new Actions(driver);
		act.moveToElement(mousehover);
		System.out.println("done");
		
		Thread.sleep(2000);
		
		WebElement changecountry = driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])"));
		changecountry.click();		
		
	}

}
