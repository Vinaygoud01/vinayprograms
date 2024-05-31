package TestngFramewokDemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browserOptions {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//to delete cookies
		driver.manage().deleteAllCookies();
		
		//to set the size of the window
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		//to see the position of the window
//		Point p=new Point(250,250);
//		driver.manage().window().setposition(p);
		Thread.sleep(2000);

		//to maximize the window
		driver.manage().window().maximize();

	}

}
