package JAVA;

public class PolyDemo6 {

	public static void main(String[] args) 
	{
		PolyDemo6 p1=new PolyDemo6();
		p1.funA(10);
		p1.funA(true);
	}
	void funA(int a)  //should not follow variable name
	{
		System.out.println("int args of PolyDemo6");
	}
	void funA(boolean b)
	{
		System.out.println("boolean args of PolyDemo6k");
	}

}
