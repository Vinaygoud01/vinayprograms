package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo2 {

	@Test
	public void Dropdown2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement ReturnDropDown = driver.findElement(By.xpath("//select[@name='toMonth']"));

		Select s1 = new Select(ReturnDropDown); // here parameterisation is web
												// element
		s1.selectByVisibleText("September");
		s1.selectByIndex(11);
		s1.selectByValue("9");

	}

}
