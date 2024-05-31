package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1
{
	@Test
	public void alertDemo1of8() throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");

		WebElement manageBookingButton = driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		manageBookingButton.click();

		Thread.sleep(4000);

		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();

		Thread.sleep(4000);
		
		WebElement text1 = driver.findElement(By.xpath("//*[@id='manage_booking']/div[1]/div[1]/div[1]/span"));
		String textonwebsite =	text1.getText();
		System.out.println(textonwebsite);






	}

}
