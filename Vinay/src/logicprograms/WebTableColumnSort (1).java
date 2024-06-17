package logicPrograms;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableColumnSort 
{
	static String sort;
	static String temp;
	
	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> columns =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		int len = columns.size();
		String[] beforeSort = new String[len];
		
		//Before sorting
		for(int i=0;i<len;i++)
		{
			beforeSort[i] = columns.get(i).getText().trim();
			System.out.println(beforeSort[i]);
		}
		System.out.println("After Sorting: ");
		
		//After sorting
		for(int i=0; i<=len-1; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				//compares each elements of the array to all the remaining elements 
				if(beforeSort[i].compareTo(beforeSort[j])>0)
				{
					//swapping array elements
					temp = beforeSort[i];
					beforeSort[i] = beforeSort[j];
					beforeSort[j] = temp;	
				}
			}
		}
		System.out.println(Arrays.toString(beforeSort));
		
		//validating weather the columns are sorted or not.
		if(beforeSort.equals(temp))
		{
			System.out.println("Colums are not sorted");
		}
		else
		{
			System.out.println("Columns are sorted");
		}
	
	}

}
