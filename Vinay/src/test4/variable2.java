package test4;

public class variable2
{
	int a=5;
	static int b=12;

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		
		int b=20;
		System.out.println(b);
		c();
		System.out.println(variable2.b);
		variable2.c();
		
		variable2 v2=new variable2();
		System.out.println(v2.a);
		v2.f();
	}
	public static void c()
	{
		int e=6;
		System.out.println(e);
	}
	public void f()
	{
		int g=7;
		System.out.println(g);
	}
	

}
