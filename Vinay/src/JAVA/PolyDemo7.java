package JAVA;

public class PolyDemo7 {

	public static void main(String[] args) 
	{
		PolyDemo7 p1=new PolyDemo7();
		A g=new A();
		p1.funA(g);  //same class address means the object address
		B e=new B();
		p1.funA(e);
		A r=null;
		p1.funA(r);  //null value
		p1.funA(new A()); //with the  class anonymous object
	}
	void funA(A a)
	{
		System.out.println("class A args of PolyDemo7");
		System.out.println(a);
	}
	void funA(B b)
     {
		System.out.println("class B args of PolyDemo7");
		System.out.println(b);
	}
	void funA(C c)
	{
		System.out.println("class C args of PolyDemo7");
		System.out.println(c);
	}
	
	
	

}
