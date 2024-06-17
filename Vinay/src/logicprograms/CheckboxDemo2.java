package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo2 
{
	
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement checkbox3G =driver.findElement(By.xpath("//[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/"));
                                                                                                                   
		boolean chechbox3Gisdisplyed = checkbox3G.isDisplayed();
		System.out.println("chechbox3Gisdisplyed: "+chechbox3Gisdisplyed);

		if(chechbox3Gisdisplyed == true)
		{
			System.out.println(" checkbox3g is displying");
		}
		else
		{
			System.out.println("chechbox3g is  not displying ");  
		}

		boolean chechbox3Gisenabled =  checkbox3G.isEnabled();

		System.out.println("chechbox3Gisenabled :"+chechbox3Gisenabled);

		if(chechbox3Gisenabled == true )
		{
			System.out.println("chechbox3g is enabled");
		}
		else
		{
			System.out.println("checkbox3g is not enabled ");
		}
		
		boolean chechbox3Gisselected =  checkbox3G.isSelected();
		System.out.println("chechbox3Gisselected :"+chechbox3Gisselected);
		if(chechbox3Gisselected == true )
		{
			System.out.println("chechbox3g is selected");
		}
		else
		{
			System.out.println("checkbox3g is not selected ");
		}
		
		checkbox3G.click();
		
		boolean chechbox3Gisselected2 =  checkbox3G.isSelected();
		System.out.println("chechbox3Gisselected2 :"+chechbox3Gisselected2);

		if(chechbox3Gisselected2 == true )
		{
			System.out.println("chechbox3g is selected");
		}
		else
		{
			System.out.println("checkbox3g is not selected ");
		}
		
		}
	
	
}
		
