package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1 
{
	@Test
	public void dropDownDemo1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name&='toMonth']"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);//
		System.out.println("done");
		
		select.selectByVisibleText("June");
		System.out.println("done");
		
		select.selectByValue("11");
		System.out.println("done");
	}

}
