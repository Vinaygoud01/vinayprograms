package errorprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpelicitWaitDemo3 
{
	@Test
	public void funA() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		WebElement checkbox3g=driver.findElement(By.xpath("//span[*id='ContentHolder_lbFeatures_TG_3G']"));
		checkbox3g.click();                                      
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_10_D']")));
		WebElement model10=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		model10.click();
	}
}