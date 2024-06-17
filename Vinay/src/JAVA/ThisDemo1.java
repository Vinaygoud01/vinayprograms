package JAVA;

public class ThisDemo1
{
	ThisDemo1()
	{
		//System.out.println("cons of ThisDemo1");
		System.out.println(this);
	}

	public static void main(String[] args)
	{
		ThisDemo1 t1=new ThisDemo1();
		System.out.println(t1);


	}

}
