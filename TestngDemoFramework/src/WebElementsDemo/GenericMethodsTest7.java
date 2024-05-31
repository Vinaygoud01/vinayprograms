package WebElementsDemo;

import java.io.IOException;

import org.testng.annotations.Test;

public class GenericMethodsTest7 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		GenericMethods7 key = new GenericMethods7();
		key.openBrowser();
		key.enterURL();
		Thread.sleep(3000);
	//	 key.enterData("name","userName","RBG1");
		key.enterData("xpath", "//input[@name='username']", "RBG2");
		key.takeScreenShot();

	}
}
