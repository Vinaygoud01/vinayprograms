package WebElementsDemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RadioButtonAssignment2 {

	@Test
	public void RadioButton2()  //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		ArrayList<WebElement> list1=new ArrayList<WebElement>();
		WebElement roundTripRadioButton =driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']"));
		list1.add(roundTripRadioButton);
		WebElement onewayRadioButton =driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
		list1.add(onewayRadioButton);
		WebElement economyRadioButton =driver.findElement(By.xpath("//input[@name='servClass' and @value='Coach']"));
		list1.add(economyRadioButton);
		WebElement businessRadioButton =driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']"));
		list1.add(businessRadioButton);
		WebElement firstRadioButton =driver.findElement(By.xpath("//input[@name='servClass' and @value='First']"));
		list1.add(firstRadioButton);
		
		WebElement radioButton1=list1.get(3);
		radioButton1.click();
		System.out.println("clicked on 4th RadioButton");
		
	}

}
