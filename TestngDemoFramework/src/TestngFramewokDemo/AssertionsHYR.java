package TestngFramewokDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class AssertionsHYR {
	
	@Test
	public void TestFaceBook() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR", Keys.ENTER);
		Thread.sleep(5000);

		SoftAssert softasert = new SoftAssert();
		// title assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");

		// URL assertion
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		assertNotEquals(actualURL, expectedURL, "URL is mismatched");
		
		// Text assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("aria-label");
		String expectedText = "Email address or phone number";
		assertEquals(actualText, expectedText, "Text is matched");
		
		//Border Assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		assertEquals(actualBorder, expectedBorder, "username Border is matched");
		
		driver.quit();
		softasert.assertAll();

	}

}
