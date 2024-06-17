package WebElementsDemo;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo1 {

	@Test
	public void Dropdown1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement Arrivingin = driver.findElement(By.xpath("//select[@name='toPort']"));

		Select s1 = new Select(Arrivingin); // here parameterisation is web
		List<WebElement> allOptions=s1.getOptions();									// element
		s1.selectByVisibleText("London");
	//	s1.selectByIndex(3);
	//	s1.selectByValue("6");
	//	s1.getFirstSelectedOption();
	//	s1.selectByVisibleText("London");
	//	s1.deselectByVisibleText("London");
	
//		List<WebElement> s2=allOptions.getAllSelectedOptions();
//		s1.deselectAll();
//		

	}

}
