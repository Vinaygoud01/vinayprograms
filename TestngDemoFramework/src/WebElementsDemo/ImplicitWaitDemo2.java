package WebElementsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo2
{
	@Test
	public void implicitwait1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //implicit: particular wait for all elements
		
		WebElement CheckBox3G = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		CheckBox3G.click();
		   
		
		WebElement CheckBox1Model10 = driver.findElement(By.xpath("//table[@id='RBG']"));
		CheckBox1Model10.click();
		
		WebElement CheckBoxBluetooth = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		CheckBoxBluetooth.click();
		   
		
		
		WebElement CheckBoxModel11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		CheckBoxModel11.click();
	}

}
