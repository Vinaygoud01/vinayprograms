package WebElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo5_BootStrapDropDown
{
	//BootStrapDropDown : if the element look like a dropdown but it does not have selecting tag name
	@Test
	public void Dropdown5()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement Arrivingin = driver.findElement(By.xpath("//select[@name='toPort']"));

		Select s1 = new Select(Arrivingin);
		List<WebElement> allOptions=s1.getOptions();
		for(WebElement option:allOptions)
		{
			if(option.getText().equals("London"))
			{
				option.click();
				break;
			}
		}

}
}
