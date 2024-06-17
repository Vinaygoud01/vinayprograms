package JAVA;

public class ThisDemo8
{
	int i=5;
	ThisDemo8()
	{
		this(20);
		System.out.println("Zero argsof ThisDemo7");
		i=15;
	}
	ThisDemo8(int a)
	{
		System.out.println("int args of ThisDemo8");
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
