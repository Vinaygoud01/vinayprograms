package JAVA;

public class ThisDemo5 {
	ThisDemo5()
	{
		System.out.println("Zero args of ThisDemo5");
		
	}
	ThisDemo5(int a)
	{
		this();  //calling the zero args constructor
		System.out.println("int args of ThisDemo5");
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ThisDemo5 t2=new ThisDemo5(20);
		System.out.println("done");
		

	}

}
