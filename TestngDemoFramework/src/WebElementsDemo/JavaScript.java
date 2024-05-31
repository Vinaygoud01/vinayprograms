package WebElementsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1459750243%3A1715924297059916&ddm=0");
		driver.get("https://demo.nopcommerce.com/");
	//	Thread.sleep(5000);
	//	WebElement element=driver.findElement(By.xpath("//span[.='Create account']"));
		//	WebElement element1=driver.findElement(By.xpath("//input[@type='email']"));
		WebElement element2=driver.findElement(By.xpath("//label[text()='Poor']"));


	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Poor']")));
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	//	Click:
	//	js.executeScript("arguments[0].click()", element);
		
	//scroll in to view:
	//	WebElement Element=elementFind(element2);
	    js.executeScript("arguments[0].scrollIntoView();", element2);
		
	//	Enter the Data:	
	//	js.executeScript("document.getElementById('identifierId').value='vinay'");
		
	//	Scrooll Down:
	//	js.executeScript("window.scrollBy(0,500);");   //this is for scrolldown to perticular loaction
	//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // this will scrolldown to end of the page
		
	//	Scrooll Up:
	//	js.executeScript("window.scrollBy(0,-500);");   //this is for scrolldown to perticular loaction
	//	js.executeScript("window.scrollBy(0,-(document.body.scrollHeight))"); // this will scrolldown to end of the page
		
	//Highlight:
	//	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);

	}

}
