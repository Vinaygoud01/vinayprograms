package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckBoxTest1 {

	@Test
	public void checkbox1()   //pass
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement CheckBox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		
		boolean CheckBoxDisplayed=CheckBox.isDisplayed();
		System.out.println("CheckBoxDisplayed :" +CheckBoxDisplayed);
		Assert.assertTrue(CheckBoxDisplayed);
		System.out.println("CheckBox is displaying");
		
		boolean CheckBoxEnabled=CheckBox.isEnabled();
		System.out.println("CheckBoxEnabled :" +CheckBoxEnabled);
		Assert.assertTrue(CheckBoxEnabled);
		System.out.println("CheckBox is Enabled");
		
		boolean CheckBoxSelected=CheckBox.isSelected();
		System.out.println("CheckBoxSelected :" +CheckBoxSelected);
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertTrue(true);
		softAssert2.assertAll();
		System.out.println("CheckBox is Selected");
		
		CheckBox.click();
		System.out.println("clicked on checkbox");
		
		boolean CheckBoxSelectedAfter=CheckBox.isSelected();   //here it is looks like checkbox but not
		//mandatory attribute=type, mandatory attribute value="checkbox";
		System.out.println("CheckBoxSelected :" +CheckBoxSelectedAfter);
		SoftAssert softAssert3 = new SoftAssert();
		softAssert3.assertTrue(true);
		softAssert3.assertAll();	
		System.out.println("CheckBox is Selected");
		
		

	}

}
