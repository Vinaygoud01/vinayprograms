package WebElementsDemo;

public class GenericMethodsTest
{

	public static void main(String[] args) 
	{
		GenericMethods key = new GenericMethods();
		key.openBrowser("chrome");
		key.enterURL("http://gmail.com");
		key.enterData("xpath","//input[@type='email']","RBG");
		key.click("xpath", "//button[@jsname='Cuz2Ue']");
	}
}
