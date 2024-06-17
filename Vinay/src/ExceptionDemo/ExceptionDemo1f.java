package ExceptionDemo;

public class ExceptionDemo1f 
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
			catch (Throwable e)
			{
				System.out.println("Throwable block is invoking");
				System.out.println(e);
			}
			System.out.println("done");
	

	}
}
