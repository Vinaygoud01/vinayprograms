package seleniumWithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class checkboxTest1 {
	@Test
	public void funA() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement CheckBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));

		boolean CheckBoxDisplayed = CheckBox.isDisplayed();
		System.out.println("CheckBoxDisplayed: " + CheckBoxDisplayed);
		SoftAssert softAssert1 = new SoftAssert();
		softAssert1.assertTrue(true);
		softAssert1.assertAll();
		System.out.println("checkbox displayed successfully");

		boolean CheckBoxEnabled = CheckBox.isEnabled();
		System.out.println("CheckBoxEnabled :" + CheckBoxEnabled);
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertTrue(true);
		softAssert2.assertAll();
		System.out.println("checkbox Enabled successfully");

		boolean CheckBoxSelected = CheckBox.isSelected();
		System.out.println("CheckBoxSelected :" + CheckBoxSelected);
		SoftAssert softAssert3 = new SoftAssert();
		softAssert3.assertTrue(true);
		softAssert3.assertAll();
		System.out.println("CheckBoxSelected Before successfully");

		CheckBox.click();
		System.out.println("clicked on checkbox");

		boolean CheckBoxSelectedAfter = CheckBox.isSelected();
		System.out.println("CheckBoxSelectedAfter :" + CheckBoxSelectedAfter);
		SoftAssert softAssert4 = new SoftAssert();
		softAssert4.assertTrue(true);
		softAssert4.assertAll();
		System.out.println("CheckBoxSelected After successfully");
	}
}
