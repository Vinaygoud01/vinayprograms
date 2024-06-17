package JAVA;

public class PolyDemo2
{

	public static void main(String[] args)
	{
		 PolyDemo2 p1=new  PolyDemo2();
		 p1.funA(10);
		 p1.funA(10,20);
		 
	}
	void funA(int a)
	{
		System.out.println("int args of funA of Polydemo2");
		System.out.println(a);
	}
	void funA(int a,int b)
	{
		System.out.println("int args of funA of Polydemo2");
		System.out.println(a);
		System.out.println(b);
	}


}
