package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExplicitWaitDemo3
{
	@Test
	public void checkbox() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		
		WebElement CheckBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		CheckBox.click();
		
		Thread.sleep(3000);
		WebElement CheckBox1 = driver.findElement(By.xpath("//table[@id='ContentHolder_lbModels_LBT']/tr[1]/td[1]"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", CheckBox1);
		CheckBox1.click();
	}

}
