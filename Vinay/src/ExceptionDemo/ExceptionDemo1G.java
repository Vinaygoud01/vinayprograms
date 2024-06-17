package ExceptionDemo;

public class ExceptionDemo1G 
{
	static A a1;

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		try
		{
			System.out.println(10/2);
			int arr[]={10,20,30,40};
			System.out.println(arr[3]);
			System.out.println(a1.i);
		}
			
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException block is invoking");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException block is invoking");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException block is invoking");
			a1=new A();
			System.out.println(a1.i);
		}
		catch(Exception e)
		{
			System.out.println("Exception block is invoking");
		}
		catch (Throwable e)
		{
			System.out.println("Throwable block is invoking");
			
		}
		System.out.println("done");
		

}
}
