package errorprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTableDemo1 
{
	@Test
	public void webTableDemo1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		WebElement webeTable = driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String webeTableText =webeTable.getText();
		System.out.println(webeTable);
		
	
		
		
		List<WebElement> allRows = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		int rowcount =allRows.size();
		System.out.println("rowcount:"+rowcount);
		
		List<WebElement> allcloumns = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		int cloumnscount =allcloumns.size();                                         
		System.out.println("cloumnscount:"+cloumnscount);
		
		String xpath1 = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		String xpath2 ="]/td[";
		String xpath3 =" ]";
		
		for( int i=1;i<rowcount;i++)
		{
			for( int j=1;j<cloumnscount;i++)
			{
				String tableData = driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
				System.out.println("tableData :"+tableData);
				System.out.println("xpath :"+xpath1+i+xpath2+i+xpath3);
			}                                                
		}
		
	}

}
