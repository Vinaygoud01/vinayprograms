package WebElementsDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandlePractice 
{
		@Test
		public void WindowHandle()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("http://gmail.com");
			WebElement linkText = driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
			linkText.click();

			String firstwindow=driver.getWindowHandle();
			Set<String> windowsId = driver.getWindowHandles(); 
			Iterator<String> windowslist = windowsId.iterator();  //if we want to iterate through all the windows and returns iterator string
			while(windowslist.hasNext())  //hasnext() - it returns true if the iterator has more elements otherwise it returns false
			{
				String window=windowslist.next();
				if(firstwindow.equalsIgnoreCase(window));
				{
				driver.switchTo().window(window);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement linktext2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='beta version of Chrome']")));
//				WebElement linkText2 = driver.findElement(By.xpath("//a[text()='beta version of Chrome']"));
				linktext2.click();
				}
			
//			for(String handle:windowsId)
//			{
//				String title=driver.switchTo().window(handle).getTitle();
//				WebElement linktext2 = driver.findElement(By.xpath("//a[text()='beta version of Chrome']"));
//				linktext2.click();
//			//	String title = driver.getTitle();
//				System.out.println("Expected Title: "+title);
////				if(title.equals("Try New Features with Google Chrome Beta - Google Chrome"))
////				{
////				//	driver.switchTo().window(title);
////					driver.close();
////				}
//
//			}
//			//	if(driver.getTitle().equals("Browse Chrome as a guest"))
//					if(driver.getTitle().equals("Try New Features with Google Chrome Beta - Google Chrome"))
//
//				{
//						driver.switchTo().window(window);
//
//					driver.close();
//				}
//			}
//		//	driver.switchTo().window(firstwindow);
//
////			WebElement windowlist = driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']"));
////			String text = windowlist.getText();
////			System.out.println("text: " + text);

		}
		}
}



