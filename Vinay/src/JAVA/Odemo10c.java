package JAVA;

public class Odemo10c
{
	A getA(int x)
	{
		A a1=new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}

	public static void main(String[] args) 
	{
		 Odemo10c d1=new  Odemo10c();
		 A x=d1.getA(6);
		 System.out.println(x);
		 System.out.println(x);
		 System.out.println(x); ///same address we will get
		 
		 System.out.println(d1.getA(5));
		 System.out.println(d1.getA(5)); //different address for these 3 bcz when we calling a function every time new object is created
		 System.out.println(d1.getA(5));
			
	

	}

}
