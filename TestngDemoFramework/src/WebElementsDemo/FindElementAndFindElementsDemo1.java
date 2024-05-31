package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementAndFindElementsDemo1 {

	@Test
	public void findelement1()
	{
		WebDriver driver=new ChromeDriver();
		//driver.findElement(By.xpath("//input[@id='RBG']"));  //for find elements it throws an error nosuchelementexeception
		driver.findElements(By.xpath("//input[@id='RBG']"));  //try catch block alternative is findelements
		//by using find elemenets we will not get any excepetion
		System.out.println("Done");


	}

}
