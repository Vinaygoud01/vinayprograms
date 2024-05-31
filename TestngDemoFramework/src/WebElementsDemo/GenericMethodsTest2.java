package WebElementsDemo;

public class GenericMethodsTest2
{

	public static void main(String[] args) throws Throwable 
	{
		GenericMethods2 key = new GenericMethods2();
		key.openBrowser("chrome");
		key.enterURL("http://gmail.com");
		key.enterData("xpath","//input[@type='email']","RBG");
		Thread.sleep(3000);
		key.click("xpath", "//button[@jsname='Cuz2Ue']");
	}
}
