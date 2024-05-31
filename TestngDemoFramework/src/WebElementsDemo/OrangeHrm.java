package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHrm
{
	@Test(dataProvider="setData")
	public void login(String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@name='username']"));
		UserNameInputBox.sendKeys(username);
		Thread.sleep(1000);
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='password']"));
		passwordInputBox.sendKeys(password);
		Thread.sleep(2000);
		WebElement connection = driver.findElement(By.xpath("//button[@type='submit']"));
		connection.click();
		
	}
	@DataProvider
	public Object[][] setData()
	{
		Object o1[][] =new Object[3][2];
		
		o1[0][0]="Admin";
		o1[0][1]="admin123";
		o1[1][0]="test";
		o1[1][1]="test123";
		o1[2][0]="vinay";
		o1[2][1]="vinay123";
		return o1;

		
	}
}
