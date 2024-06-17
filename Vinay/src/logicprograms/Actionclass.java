package logicprograms;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionclass 
{
	@Test
	public void actionclass()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame();
		WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropelement = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragelement, dropelement);
		
		System.out.println("done");
		
		
	}

}
