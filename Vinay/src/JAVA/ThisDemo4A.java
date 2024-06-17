package JAVA;

public class ThisDemo4A       //use of constructor chaining
{
	int i;
	int j;
	ThisDemo4A()
	{
		this(20);
		System.out.println("Zero args of ThisDemo4A");
		i=10;
	}
	ThisDemo4A(int a)
	{
		System.out.println("int args of ThisDemo4A");
		j=a;
	}

	public static void main(String[] args) 
	{
		ThisDemo4A t1=new ThisDemo4A();
		

	}

}
