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

public class WindowHandleDemo
{
	@Test
	public void WindowHandle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement linkText = driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
		linkText.click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement linktext2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='beta version of Chrome']")));
//////		WebElement linkText2 = driver.findElement(By.xpath("//a[text()='beta version of Chrome']"));
//		linktext2.click();

		String firstwindow=driver.getWindowHandle();
		Set<String> windowsId = driver.getWindowHandles(); 
		System.out.println(windowsId);
		Iterator<String> windowslist = windowsId.iterator();
		System.out.println(windowslist);//if we want to iterate through all the windows and returns iterator string
		String parentWindowId = windowslist.next();  //this code is for single parent and single child window
		String childWindowId = windowslist.next();   //for multiple windows it wont work
		driver.switchTo().window(childWindowId);
		WebElement linktext2 = driver.findElement(By.xpath("//a[text()='beta version of Chrome']"));
		linktext2.click();
		String childWindow3 = windowslist.next();
		System.out.println(childWindow3);
		driver.switchTo().window(childWindow3);
		WebElement linktext3 = driver.findElement(By.xpath("//a[@title='Facebook']"));
		linktext3.click();
		if(driver.getTitle().equals("Try New Features with Google Chrome Beta - Google Chrome"))
		{
		//	String childWindow3 = windowslist.next();
			driver.switchTo().window(childWindow3);
		}

//		while(windowslist.hasNext())  //hasnext() - it returns true if the iterator has more elements otherwise it returns false
//		{
//			String window=windowslist.next();
//			driver.switchTo().window(window);
//			WebElement linktext2 = driver.findElement(By.xpath("//a[text()='beta version of Chrome']"));
//			linktext2.click();
//			String window3=windowslist.next();
//			driver.switchTo().window(window3);
//			String window3title=driver.getTitle();
//
//		//	if(driver.getTitle().equals("Browse Chrome as a guest"))
//				if(window3title.equals("Try New Features with Google Chrome Beta - Google Chrome"))
//
//			{
//				driver.close();
//			}
//		}
	//	driver.switchTo().window(firstwindow);

//		WebElement windowlist = driver.findElement(By.xpath("//h1[text()='Browse Chrome as a guest']"));
//		String text = windowlist.getText();
//		System.out.println("text: " + text);

	}
}
