package WebElementsDemo;

public class GenericMethodsTest4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		GenericMethods4 key = new GenericMethods4();
		key.openBrowser("chrome");
		key.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		 key.enterData("name","username","RBG1");
		// key.enterData("cssSelector","input[name='username']","RBG2");
		//key.enterData("xpath", "//input[@placeholder='Username']", "RBG");

	}
}
