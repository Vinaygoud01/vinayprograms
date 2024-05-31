package WebElementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightElement {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		chapter2();

	}
	public static void highlight(WebElement element)
	{
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;	
	//	 element = elementFind(element);
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
	}
	public static void chapter2() throws Throwable
	{
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		WebElement exercise=driver.findElement(By.xpath("//a[@title=\"Exercises and Quizzes\"]"));
		highlight(exercise);
		exercise.click();
		
	}
}
