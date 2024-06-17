package errorprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWindowDemo3 
{
	@Test
	public void popupWindowDemo3()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();

		Set<String> window2 = driver.getWindowHandles();
		Iterator<"integer"> window2A =window2.iterator();
		String parent = window2A.next();
		String child = window2A.next();

		driver.switchTo().window(parent);

		WebElement actuallabel =driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
		String labeltext = actuallabel.getText();
		System.out.println(labeltext);



	}

}
