package testngDemo1;

import org.testng.annotations.Test;

public class testngclass1 {

	public static void main(String[] args) //by using testng annotation without main method it will execute
	{
		System.out.println("main method");
	}
	@Test //mouse over here then click on library and import it
	//without calling the function by using testng it will execute that method
	public void funA()
	{
		System.out.println("funA of TestNGDemoclass ");
	}

}
