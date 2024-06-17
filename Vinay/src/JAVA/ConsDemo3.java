package JAVA;

public class ConsDemo3
{
	int a=10;
	ConsDemo3()
	{
		System.out.println("cons of ConsDemo3");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo3");
		ConsDemo3 C1=new ConsDemo3();
		System.out.println(C1.a);
		System.out.println("done");
	

	}

}
