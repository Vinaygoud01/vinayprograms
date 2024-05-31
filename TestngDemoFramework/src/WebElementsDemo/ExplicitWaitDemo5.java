package WebElementsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo5
{
	@Test
	public void checkbox() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		
		WebElement CheckBox3G = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		CheckBox3G.click();
		   
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));   //this is new versions code
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='RBG']")));
		WebElement CheckBox1Model10 = driver.findElement(By.xpath("//table[@id='ContentHolder_lbModels_LBT']/tr[1]/td[1]"));
		CheckBox1Model10.click();
		
		WebElement CheckBoxBluetooth = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		CheckBoxBluetooth.click();
		   
	//	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_11_D']")));
		
		WebElement CheckBoxModel11 = driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		CheckBoxModel11.click();
	}

}
