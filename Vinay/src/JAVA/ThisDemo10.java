package JAVA;

public class ThisDemo10
{
	ThisDemo10()
	{
		System.out.println("zero args of ThisDemo10");
	}this(20);   //compile error
	ThisDemo10(int a)
	{
		System.out.println("int args cons of ThisDemo10");
		this();   //error bcz constructor should be declared at first statement only
	}

	public static void main(String[] args)
	{
		
		

	}

}
