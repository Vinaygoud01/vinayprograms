package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropDemo1 
{
	@Test
	public void DragAndDrop()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);  //for action class to visible browser, using driver
		act.dragAndDrop(drag, Drop);
	
		System.out.println("Done");
	}

}
