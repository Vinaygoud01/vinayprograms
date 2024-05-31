package WebElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> link = driver.findElements(By.xpath("//*[@id='page']/section[3]/div/ul/li[1]/div/a"));
		link.size();
		System.out.println("link : " + link.size());

		List<WebElement> link1 = driver.findElements(By.tagName("a"));
//		link1.size();
//		System.out.println("Number of links : " + link1.size());
//		System.out.println("Done");
		
		//to print all the links
//		for(int i=0;i<=link1.size();i++)
//		{
//			System.out.println(link1.get(i).getText());  //to get the text only
//			System.out.println(link1.get(i).getAttribute("href"));   //to get that link
//		}
		
		//by using foe each loop
		for(WebElement links:link1)
		{

			System.out.println(links.getText());  //to get the text only
			System.out.println(links.getAttribute("href"));   //to get that link
			
		}

	}

}
