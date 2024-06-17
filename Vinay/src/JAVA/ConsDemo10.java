package JAVA;

public class ConsDemo10
{
	int a=5;
	int b=20;
	ConsDemo10 (int i,int j)
	{
		a=i;
		b=j;
	}

	public static void main(String[] args)
	{
		System.out.println("main method of ConsDemo10");
		ConsDemo10 C1=new ConsDemo10(20,30);
		System.out.println(C1.a);
		System.out.println(C1.b);
		System.out.println("done");
		
		
		
		
	

	}

}
