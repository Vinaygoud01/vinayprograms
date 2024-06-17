package ExceptionDemo;

public class ExceptionDemo2
{
	public static int a=10;
	public static int b=0;
	

	public static void main(String[] args)
	{
		addnumbers();
		subnumbers();
		divnumbers();
		mulnumbers();
	}
	public static void addnumbers()
	{
		try
		{
			System.out.println((a+b));
		}
		catch(Exception e)
		{
			System.out.println("exeception block is invoiking");
		}
	}
	public static void subnumbers()
	{
		try
		{
			System.out.println((a-b));
		}
		catch(Exception e)
		{
			System.out.println("exeception block is invoiking");
		}
	}
	public static void divnumbers()
	{
		try
		{
			System.out.println((10/0));
		}
		catch(Exception e)
		{
			System.out.println("exeception block is invoiking");
		}
	}
	public static void mulnumbers()
	{
		try
		{
			System.out.println((10*0));
		}
		catch(Exception e)
		{
			System.out.println("exeception block is invoiking");
		}

}
}
