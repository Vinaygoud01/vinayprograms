package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownDemo3 {

	@Test
	public void Dropdown3() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.findElement(By.xpath("//div[text()='Origin']")).click();
		Thread.sleep(4000);  //4 sec waiting time
		WebElement Origin = driver.findElement(By.xpath("//li[text()='Hyderabad']"));
		Origin.click();
//		Select s1 = new Select(Origin); // here parameterisation is web
//									 
//		s1.selectByVisibleText("Hyderabad");
		//s1.selectByIndex(11);
//		s1.selectByValue("10");

	}

}
