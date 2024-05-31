package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropslider

{
	@Test
	public void DragAndDrop()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions act=new Actions(driver);  //for action class to visible browser, using driver
		act.dragAndDropBy(drag, 20, 46).perform();
		
		System.out.println("Done");
	}

}
