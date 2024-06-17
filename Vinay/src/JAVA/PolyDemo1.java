package JAVA;

public class PolyDemo1 
{

	public static void main(String[] args)
	{
		PolyDemo1 p1=new PolyDemo1();
		 p1.funA();
		 p1.funA(10);
		 p1.funA(10.23f); //for float
		 p1.funA(10.23); //for Double
	}
		 void funA()
		 {
			 System.out.println("zero args of polyDemo1");
		 }
		 void funA(int a)
		 {
			 System.out.println("int args funA of PolyDemo1");
			 System.out.println(a);
		 }
		 void funA(long b)
		 {
			 System.out.println("long args funA of PolyDemo1");
			 System.out.println(b);
		 }
		 void funA(float c)
		 {
			 System.out.println("float args funA of PolyDemo1");
			 System.out.println(c);
		 }
		 void funA(double d)
		 {
			 System.out.println("double args funA of PolyDemo1");
			 System.out.println(d);
		 }
		 
		 
		

	}


