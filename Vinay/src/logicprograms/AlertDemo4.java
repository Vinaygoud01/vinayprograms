package errorprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo4
{
	@Test
	public void alertDemo4() throws Exception 
	{
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.manage().window().maximize();
		WebElement managebookings= driver.findElement(By.xpath("//a[href='manage-bookings.html']"));
		managebookings.click();
		Thread.sleep(3000);

		WebElement search= driver.findElement(By.xpath("//*[@type='submit']"));
		search.click();                     
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		
		 String alertext =alert.getText();
		System.out.println("alertext"+alertext);
		
		alert.dismiss();

		WebElement label = driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		System.out.println(label.getText());
	}
}
