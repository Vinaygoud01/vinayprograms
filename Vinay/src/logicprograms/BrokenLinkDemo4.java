package errorprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkDemo4 
{
	@Test
	public void brokenLinkDemo4() throws IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/GOLLA/Downloads/BrokenLink1%20(1).html");
		WebElement linkes = driver.findElement(By.tagName("a"));
		String linkAttribute = linkes.getAttribute("href");

		if(linkAttribute.equals(""))
		{
			System.out.println("link is not working");
		}
		else
		{
			URL url = new URL("linkAttribute");
			HttpURLConnection hrul=(HttpURLConnection)url.openConnection();
			int responsecode = hrul.getResponseCode();
			if(responsecode<=400)
			{
				System.out.println("link is not working");
			}
			else
			{
				System.out.println("link is broken");
			}
		}

	}

}
