package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframeDemo3 {

	@Test
	public void iframe3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/Iframe1%20(1).html");
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement label = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String LabelText = label.getText();
		System.out.println("LabelText :" +LabelText);
		driver.switchTo().parentFrame();
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='text1' and @name='Town']"));
		inputbox.sendKeys(LabelText);
		
		WebElement label2 = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String LabelText2 = label2.getText();
		System.out.println("LabelText2 :" +LabelText2);
		driver.switchTo().defaultContent();  //it will come to the home page
		driver.switchTo().frame(1);
		//driver.switchTo().frame("https://demo.guru99.com/test/newtours/index.php");
		WebElement inputbox2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		inputbox2.sendKeys(LabelText2);
		
		
		
		
	

	}

}
