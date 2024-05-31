package WebElementsDemo;

public class GenericMethodsTest5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		GenericMethods4 key = new GenericMethods4();
		key.openBrowser("chrome");
		key.enterURL("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(3000);
	//	 key.enterData("name","userName","RBG1");
		key.enterData("xpath", "//input[@name='userName']", "RBG2");

	}
}
