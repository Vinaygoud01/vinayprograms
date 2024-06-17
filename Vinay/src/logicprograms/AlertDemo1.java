package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1
{
	@Test
	public void alertDemo1() throws Exception 
	{
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.manage().window().maximize();
		WebElement managebookings= driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		managebookings.click();
		

		WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
	
		WebElement label = driver.findElement(By.xpath("//h1[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		System.out.println(label.getText());
	}
}
