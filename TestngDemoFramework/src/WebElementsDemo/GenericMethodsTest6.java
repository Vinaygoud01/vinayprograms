package WebElementsDemo;

import java.io.IOException;

public class GenericMethodsTest6 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		GenericMethods6 key = new GenericMethods6();
		key.openBrowser();
		key.enterURL();
	//	Thread.sleep(3000);
	//	 key.enterData("name","userName","RBG1");
		//key.enterData("xpath", "//input[@name='userName']", "RBG2");

	}
}
