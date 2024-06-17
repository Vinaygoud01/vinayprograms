package JAVA;

public class MethodDemo2 {

	public static void main(String[] args) {
		System.out.println("main method of MethodDmeo1");
		funC();
		//funA();
		//funB();
		
		MethodDemo2 m1=new MethodDemo2();
		m1.funA();
		m1.funB();
		

	}
	void funA()
	{
		System.out.println("FunA of  MethodDemo2 ");
	}
	void funB()
	{
		System.out.println("FunB of  MethodDemo2 ");
	}
	static void funC()
	{
		System.out.println("Func of  MethodDemo2 ");
	}

}
