package JAVA;

public class MethodDemo4 {

	public static void main(String[] args) {
		System.out.println("main method of MethodDmeo4");
		funC();
		System.out.println("done");

	}

	static void funA()
	{
		System.out.println("FunA of  MethodDemo4 ");
		funC();
	}
	static void funB()
	{
		System.out.println("FunB of  MethodDemo4 ");
		funA();
	}
	static void funC()
	{
		System.out.println("FunC of  MethodDemo4 ");
		funB();
	}
}
