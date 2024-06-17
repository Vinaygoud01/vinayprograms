package JAVA;

public class ThisDemo7
{
	int i=5;
	ThisDemo7()
	{
		System.out.println("Zero argsof ThisDemo7");
		i=15;
	}
	ThisDemo7(int a)
	{
		this();
		System.out.println("int args of ThisDemo7");
		System.out.println(a);
		i=a;
	}
	

	public static void main(String[] args)
	{
		System.out.println("main method of ThisDemo7");
		ThisDemo7 t1=new ThisDemo7(20);
		System.out.println(t1.i);
		System.out.println("done");
		

	}

}
