package test4;

public class Methodoverloading1 {
	int i=10;

	public static void main(String[] args) 
	{
		Methodoverloading1 m1=new Methodoverloading1();
		m1.funA(10);
		
	}
	void funA()
	{
		System.out.println("Zero args");
	}
	int funA()
	{
		System.out.println("int args");
		System.out.println(i);
		
	}
	void funA(long l)
	{
		System.out.println("long args");
		System.out.println(l);
	}

}
