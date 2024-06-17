package ExceptionDemo;

public class ExceptionDemo1A {

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exception block is invoking");
		}
		System.out.println("done");
		

	}

}
