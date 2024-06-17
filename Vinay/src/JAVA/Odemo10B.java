package JAVA;

public class Odemo10B 
{
	A getA(int x)
	{
		A a1=new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}

	public static void main(String[] args) {
		Odemo10B d1=new Odemo10B();
		int i=d1.getA(6).i;
		A x=d1.getA(7).funA();
		A x2=d1.getA(7);
		int b=d1.getA(7);
		int c=d1.getA(7).funA();
		
		

	}

}
