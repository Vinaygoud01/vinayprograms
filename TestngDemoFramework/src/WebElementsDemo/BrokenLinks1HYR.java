package WebElementsDemo;	
	import java.net.HttpURLConnection;
	import java.net.InetSocketAddress;
	import java.net.Proxy;
	import java.net.URL;
	import java.net.URLConnection;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;	
    //brokenlinks :which doesn't have any target page
	//Reason-- may be the page is removed from the page or the structure of the website is changed
	/**
	 * @author Yadagiri Reddy
	 * How to find Broken Links using Selenium WebDriver?
	 */
	public class BrokenLinks1HYR {
		public static void main(String[] args) throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/");
			Thread.sleep(5000);

	//		Set<String> brokenlinkUrls = new HashSet<String>();  //set doesnt allow duplicates so to print only brokenlinks we are using here
			List<WebElement> links = driver.findElements(By.tagName("a"));  //links tag name is 'a' or you can use xpath also
			System.out.println(links.size());  //printing the size

			for (WebElement link : links) {
				String linkURL = link.getAttribute("href");	//href stores the linkAddress and here we are storing in linkURL
			//	Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 80)); //in the company u r connected to the proxy so create one instance here 80 is the port name
				URL url = new URL(linkURL);  //URL is a class in the java we are creating an instance
				URLConnection urlConnection = url.openConnection(); //use proxy in braket to connect proxy //opening connection to that server
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;  
				//in webapplications we have 2 types of request 1.HTTp 2.HTTPS
				//HTTP-httpurlconnection and it is a abstarct calss  and for HTTPS-httpsurlconnection
				httpURLConnection.setConnectTimeout(5000); //waiting time
				httpURLConnection.connect();  //sends the request to the server
				if(httpURLConnection.getResponseCode() >= 200)
				{
					System.out.println(linkURL+ "is a broken link");
				}
				else
				{
					System.out.println(linkURL+ "is not a broken link");
				}
				
			}
			driver.quit();
			
//			for (String brokenLinkUrl : brokenlinkUrls) {
//				System.err.println(brokenLinkUrl);
//			}
		}
		}
	


