package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2
{
	@Test
	public void alertDemo2() throws Exception 
	{
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		driver.manage().window().maximize();
		WebElement managebookings= driver.findElement(By.xpath("//a[href='manage-bookings.html']"));
		managebookings.click();                                 
		

		WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(4000);
		String alertext =driver.switchTo().getText();
		System.out.println("alertext:"+alertext);

		driver.switchTo().alert().accept();

		WebElement label = driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		System.out.println(label.getText());
	}
}
