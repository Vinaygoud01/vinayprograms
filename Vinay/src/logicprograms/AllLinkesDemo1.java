package errorprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinkesDemo1 
{

	@Test
	public void allLinkesDemo1()
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.bbc.com/");
      List<WebElement> linkes = driver.findElements(By.xpath("a"));
                                         
      System.out.println(" linkcount:"+linkes.size());
      
	}

}
