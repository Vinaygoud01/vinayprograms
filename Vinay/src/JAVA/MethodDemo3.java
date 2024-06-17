package JAVA;

public class MethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method of MethodDmeo1");
		funB();
		System.out.println("done");
	}
	static void funA()
	{
		System.out.println("FunA of  MethodDemo2 ");
	}
	static void funB()
	{
		System.out.println("FunB of  MethodDemo2 ");
		funA();
	}
}
