package test;

public class StaticDemo 
{
	static int add(int a,int b)
	{
	
		System.out.println(a+b);
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		System.out.println(a+b+c);

		return a+b+c;
	}
	public static void main(String[] args)
	{
		add(11,11);
		add(11,12,13);
		
	}

}
