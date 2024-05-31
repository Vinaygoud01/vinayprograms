package WebElementsDemo;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrokenLinkDemo4 
{

	@Test
	public void brokenlink4() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/BrokenLink1.html");
		WebElement link1= driver.findElement(By.tagName("a"));
		String linkname=link1.getAttribute("href");
		SoftAssert s3 =new SoftAssert();
		s3.assertEquals(linkname, "");
		System.out.println("done");
//		if(linkname.equals(""))
//		{
//			System.out.println("link is broken");
//		}
//		else
//		{
			URL url=new URL(linkname);
			HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();//child and parent relation url connection is the parent, child is http url
			//urlConnection.setConnectTimeout(5000);
			//urlConnection.connect();
			
			int responseCode = urlConnection.getResponseCode();  //any responce code is greater than or equal to 400 then it wont work
			System.out.println(responseCode);
			Assert.assertTrue(responseCode>=400);
			System.out.println("link is broken");
			
//			if(responseCode>=400)
//			{
//				System.out.println("link is broken");
//			}
//			else
//			{
//				System.out.println("link is working fine");
//			}
		}

	}



