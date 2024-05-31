package fileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo2 
{
	@Test
	public void fileuploadtest() throws IOException, Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/FileUploadDemo1.html");
		WebElement fileupload=driver.findElement(By.xpath("//input[@type='file']"));
		fileupload.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C://Users//ADMIN//Desktop//simple.java");  //Runtime.getRuntime().exec() is used to execute a command-line command to run a Java program (simple.java) located at C:/Users/ADMIN/Desktop/. 
		System.out.println("done");
	}

}
