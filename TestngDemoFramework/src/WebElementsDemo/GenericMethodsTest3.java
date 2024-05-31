package WebElementsDemo;

public class GenericMethodsTest3
{

	public static void main(String[] args) 
	{
		GenericMethods3 key = new GenericMethods3();
		key.openBrowser("chrome");
		key.enterURL("https://demo.guru99.com/test/newtours/reservation.php");
		key.selectDropDown("xpath","//select[@name='toPort']","London",2);
	
	}
}
