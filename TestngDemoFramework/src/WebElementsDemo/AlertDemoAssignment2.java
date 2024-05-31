package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemoAssignment2 
{
	@Test
	public void AlertassignmentClick2() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement secondButton = driver.findElement(By.xpath("//button[@id='confirmBox']"));
		secondButton.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	//	driver.switchTo().alert().dismiss();
		
		WebElement AlertText = driver.findElement(By.xpath("//div[@id='output']"));
		String DisplayedAlretText=AlertText.getText();
		System.out.println("DisplayedAlretText: "+DisplayedAlretText);

}
}