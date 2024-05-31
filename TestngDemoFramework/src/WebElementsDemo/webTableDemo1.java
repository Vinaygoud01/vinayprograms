package WebElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**Web Tables are like normal tables where the data is presented in a structured form using rows and columns. The only difference is that they are displayed on the web with the help of HTML code.
<table> is the HTML tag that is used to define a web table. While <th> is used for defining the header of the table, <tr> and <td> tags are used for defining rows and columns respectively for the web table.

Types of Web Tables
Depending on the data in the table, web tables can be classified as Static web tables and Dynamic web tables.

1. Static Web Tables
These tables have fixed data that remains unchanged throughout. Due to the static nature of their content, they are called Static web tables.

2. Dynamic Web Tables
These tables have data that changes over time, and hence the number of rows and columns might also change depending upon the data shifts. Due to the dynamic nature of their content, they are called Dynamic web tables.**/

public class webTableDemo1 {

	@Test
	public void webtable1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		WebElement table=driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String firstcellData=table.getText();
		 System.out.println("firstcellData :" +firstcellData);
		 
		 List<WebElement> allrowscount=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
		 int rowscount=allrowscount.size();
		 System.out.println("rowscount :" +rowscount);
		 
		 List<WebElement> allcolumncount=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
		 int columncount=allcolumncount.size();
		 System.out.println("columncount :" +columncount);
		 
		 
		 String xpath1 = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		 String xpath2="]/td[";
		 String xpath3="]";
		 
		 for(int i=1; i<=rowscount;i++)
		 {
			 for(int j=1 ;j<=columncount; j++)
			 {
				 System.out.println("xpath : "+xpath1+i+xpath2+j+xpath3);
				 String allValueData=driver.findElement(By.xpath(xpath1+i+xpath2+j+xpath3)).getText();
				 System.out.println(allValueData);
			 }
		 }

	}

}
