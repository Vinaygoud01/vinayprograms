package errorprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Inputboxdemo1 
{

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://gmail.com");
      boolean inputboxisdisplyed = driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
      if(inputboxisdisplyed == true)
      {
    	 System.out.println(" inputbox is displying");
      }
      else
      {
    	System.out.println("inputbox is  not displying ");  
      }
      boolean inputboxisenabled =  driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
       if(inputboxisenabled == true )
       {
    	   System.out.println("inputbox is enabled");
       }
       else
       {
    	   System.out.println("inputbox is not enabled ");
       }
       String actualwatermark = driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
       String expectedwatermark = "Email or phone";
       if(actualwatermark.equals(expectedwatermark))
       {
    	   System.out.println(" watermarkes is displying as expected");
       }
       else
       {
    	   System.out.println("watermarkes is not displying as expected");
       }
       driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("");
      String actualenterdata = driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("");
      if(actualenterdata.equals("rbg"))                                 
      {
    	  System.out.println("data entered successfully");
      }
      else
      {
   	  System.out.println("data entered not successfully");
      }
	}

}
