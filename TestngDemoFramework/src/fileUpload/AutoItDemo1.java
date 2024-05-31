package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo1 
{
	@Test
	public void fileuploadtest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C://Users//ADMIN//Downloads//FileUploadDemo1.html");
		WebElement fileupload=driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.sendKeys("C://Users//ADMIN//Desktop//simple.java");  //fileupload is for firefox and open is for chrome
		System.out.println("done");
	}

}
