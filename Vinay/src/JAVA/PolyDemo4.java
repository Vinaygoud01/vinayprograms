package JAVA;

public class PolyDemo4 {

	public static void main(String[] args) 
	{
		PolyDemo4 p1=new PolyDemo4();
		p1.funA(10,20); //ambiguity confusion will occur to execute which statement 
	}
	 void funA(int a,long b)
	{
		System.out.println("int long args of PolyDemo4");
	}
     void funA(long a,int b)
	{
		System.out.println("int long args of PolyDemo4");
	}

}
