package JAVA;

public class ConsDemo8 
{
	ConsDemo8(int a)  //All parameter variables are local variables
	{
		System.out.println("cons of ConsDemo8");
		System.out.println(a);
		
	}

	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo8");
		ConsDemo8 C1=new ConsDemo8(20);
		ConsDemo8 C2=new ConsDemo8(30);
		System.out.println("done");


	}

}
