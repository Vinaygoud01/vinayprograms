package WebElementsDemo;

import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkDemo5 {   //failed

	@Test
	public void brokenlink5() throws Throwable
	{
		URL url1=new URL("https://rbgtechnologies.com/");
		
			HttpURLConnection urlConnection=(HttpURLConnection) url1.openConnection();//child and parent relation url connection is the parent child is http url
			urlConnection.connect();
			urlConnection.setConnectTimeout(5000);
		
			
			int responseCode = urlConnection.getResponseCode();  //any responce code is greater than or equal to 400 then it wont work
			System.out.println(responseCode);
			Assert.assertTrue(responseCode>=400);
			System.out.println("link is working fine");
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


