package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pranay {

    WebDriver driver = new ChromeDriver();
	
	public void IsElementPresent(By xpathvalue)
	{
	  boolean isAvailable = false;
	  
	  try
	  {
        driver.findElement(xpathvalue);
        isAvailable = true;
	  }
	  catch (Exception ex)
	  {
		  isAvailable = false;
	  }

}
}
