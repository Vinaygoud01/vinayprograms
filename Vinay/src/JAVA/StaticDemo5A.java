package JAVA;

public class StaticDemo5A
{
	int a=funA();
	static int b=funB();

	public static void main(String[] args)
	{
		System.out.println("main method start");
		System.out.println(b);
		
		StaticDemo5A s1=new StaticDemo5A();
		s1.funA();
		System.out.println(s1.a);
		
		System.out.println("done");
	}
	int funA()
	{
		System.out.println("funA of StaticDemo5A");
		return 10;
	}
	static int funB()
	{
		System.out.println("funB of staticDemo5");
		return 20;
	}

	



//new StaticDemo5A();
//new StaticDemo5A();
//new StaticDemo5A();
//new StaticDemo5A();

}
