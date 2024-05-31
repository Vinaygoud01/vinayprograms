package WebElementsDemo;

import java.io.IOException;

import org.testng.annotations.Test;

public class GenericMethodsTest8 
{

	@Test
	public void GenericMethodsTest8() throws Throwable
	{
		GenericMethods8 key = new GenericMethods8();
		key.openBrowser();
		key.enterURL();
		Thread.sleep(4000);
		key.takeScreenShot("file1");
		key.enterData("xpath", "//input[@name='username']", "Admin");
		key.takeScreenShot("file2");
		key.enterData("xpath", "//input[@name='password']", "admin123");
		key.takeScreenShot("file3");
		key.click("xpath", "//button[@type='submit']");
		Thread.sleep(10000);
		key.takeScreenShot("file4");
		key.extentReportsTest();
		

	}
}
