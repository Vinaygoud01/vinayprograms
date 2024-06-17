package ExceptionDemo;

public class ExceptionDemo1c {

	public static void main(String[] args) 
	{
		System.out.println("main method start");
	
	try
	{
		System.out.println(10/2);
		int arr[]={10,20,30,40};
		System.out.println(arr[4]);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException block is invoking");
	}
	System.out.println("done");

}
}
