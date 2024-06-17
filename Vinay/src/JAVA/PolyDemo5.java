package JAVA;

public class PolyDemo5 {

	public static void main(String[] args)
	{
		PolyDemo5 p1=new PolyDemo5();
		p1.funA(10);
	}
	void funA(int a)
	{
		System.out.println("int args of PolyDemo5");
	}
	void funA(int b)  //same data type with different variable name it doesnt allow
	{
		System.out.println("int args of PolyDemo5");
	}
}
