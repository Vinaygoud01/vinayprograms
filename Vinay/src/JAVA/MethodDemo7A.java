package JAVA;

public class MethodDemo7A {

	public static void main(String[] args)
	{
		System.out.println("main method of MethodDemo7A");
		MethodDemo7A m1=new MethodDemo7A();
		m1.funB();   //funA calling as m1.funA();
		System.out.println("done");

	}
	void funA()
	{
		System.out.println("funA of MethodDemo7A");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7A");
		funA();   //calling from funB current object
	}

}
