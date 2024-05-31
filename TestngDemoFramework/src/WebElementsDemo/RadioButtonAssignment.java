package WebElementsDemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonAssignment {

	@Test
	public void RadioButton()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		ArrayList<WebElement> List1=new ArrayList<WebElement>();
		List1.add(driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']")));
		List1.add(driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")));
		List1.add(driver.findElement(By.xpath("//input[@name='servClass' and @value='Coach']")));
		List1.add(driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")));
		List1.add(driver.findElement(By.xpath("//input[@name='servClass' and @value='First']")));
		
		
		WebElement radioButton1=List1.get(3);
		radioButton1.click();
		System.out.println("clicked on 4th RadioButton");
		
	}

}
