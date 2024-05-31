package WebElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2 {


	@Test
	public void webtable2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		WebElement securityName=driver.findElement(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr/td[2]"));
		String columnname=securityName.getText();
		System.out.println("columnname: "+columnname);

		List<WebElement> SecurityName1=driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td[2]"));
		int securitynamescolumnData=SecurityName1.size();
		System.out.println("securitynamescolumnData: "+securitynamescolumnData);
		
		 String xpath1 = "//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
		 String xpath2="]/td[2]";
		 
		
		 for(int i=1; i<=securitynamescolumnData;i++)
		 {
//			 System.out.println("done");
//			 System.out.println("xpath : " +xpath1+i+xpath2);
			 String column2Data=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			 System.out.println(column2Data);


	}

}
}
