package JAVA;

public class ThisDemo4
{
	int i;
	int j;
	ThisDemo4()
	{
		System.out.println("Zero args of ThisDemo4");
		i=10;
	}
	ThisDemo4(int a)
	{
		System.out.println("int args of ThisDemo4");
		j=a;
	}

	public static void main(String[] args) 
	{
		ThisDemo4 t1=new ThisDemo4();
		ThisDemo4 t2=new ThisDemo4(20);
		

	}

}
