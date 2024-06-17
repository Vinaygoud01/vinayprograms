package JAVA;

public class MethodDemo7 
{

	public static void main(String[] args)
	{
		System.out.println("main method of MethodDemo7");
		MethodDemo7 m1=new MethodDemo7();
		m1.funB();
		System.out.println("done");
		}
	void funA()
	{
		System.out.println("funA of MethodDemo7");
	}
	void funB()
	{
		System.out.println("funB of MethodDemo7");
		MethodDemo7 m1=new MethodDemo7();
		m1.funA();
	}

}
