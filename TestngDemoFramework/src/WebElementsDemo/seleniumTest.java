package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumTest 
{
	@Test
	public void alertDemo1of8() throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
//		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-83837230%3A1715851323103613&ddm=0");
//		WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
//		String attributevalue=element.getAttribute("aria-label");
//		System.out.println("attributevalue"+attributevalue);
//		String CurrtentTitle=driver.getTitle();
//		System.out.println("title"+CurrtentTitle);
//		String CurrtentURL=driver.getCurrentUrl();
//		System.out.println("URL"+CurrtentURL);
		String pagesource=driver.getPageSource();
		System.out.println("pagesource"+pagesource);
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveJobTitle");
	//	driver.get("https://www.javatpoint.com/java-iterator");
	//	driver.navigate().back();
//		driver.navigate().to("https://www.javatpoint.com/java-iterator");
//		driver.navigate().refresh();

	}
}
