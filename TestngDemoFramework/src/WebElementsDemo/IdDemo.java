package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdDemo 
{
	@Test
	public void Id()
	{
		ChromeDriver driver=new ChromeDriver();  
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("Arif");
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.findElement(By.name("userName"));
		
	}

}
