package WebElementsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo2
{
	@Test
	public void checkbox() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		WebElement CheckBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		CheckBox.click();
		   
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));   //this is new versions code
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//table[@id='ContentHolder_lbModels_LBT']/tr[1]/td[1]")));
		Thread.sleep(3000);
		WebElement CheckBox1 = driver.findElement(By.xpath("//table[@id='ContentHolder_lbModels_LBT']/tr[1]/td[1]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", CheckBox1);
		CheckBox1.click();
	}

}
