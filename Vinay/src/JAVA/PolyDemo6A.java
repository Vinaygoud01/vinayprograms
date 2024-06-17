package JAVA;

public class PolyDemo6A {

	public static void main(String[] args)
	{
		PolyDemo6A p1=new PolyDemo6A();
		int b=10;
		p1.funA(b);
		boolean a=true;
		p1.funA(a);
	}
	void funA(int a)
	{
		System.out.println("int args of PolyDemo6A");
	}
	void funA(boolean b)
	{
		System.out.println("boolean args of PolyDemo6A");
	}

}
