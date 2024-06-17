package JAVA;

public class PolyDemo3 {

	public static void main(String[] args)
	{
		PolyDemo3 p1=new PolyDemo3();
		//p1.funA(10,20);
		p1.funA(100000,20000000);
	}
	public void funA(int a,int b)
	{
		System.out.println("int int args of PolyDemo3");
	}
	public void funA(long a,long b)
	{
		System.out.println("long long args of PolyDemo3");
	}

}
