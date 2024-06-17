package JAVA;

public class StaticDemo1
{
	static StaticDemo1 s1=new StaticDemo1();
	//StaticDemo1 s1=new StaticDemo1(); //stack overflow Error
	public static void main(String[] args)
	{
		System.out.println("main method start");
		StaticDemo1 s1=new StaticDemo1();
		System.out.println("done");
	

	}

}
