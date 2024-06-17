package JAVA;

public class ThisDemo12
{
	ThisDemo12()
	{
		this(20);  //it will call int args  
		System.out.println("Zero args of ThisDemo12");
	}
	ThisDemo12(int a)
	{
		this();  //it will call Zero args cons.
		System.out.println("int args cons of ThisDemo12");
	}

	
}
