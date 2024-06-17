package JAVA;

public class ConsDemo8A
{
	int i=10;
	ConsDemo8A(int a)  //parameterised constructor is used to provide diff. values to the distinct objects
	{
		System.out.println("cons of ConsDemo8A");
		//System.out.println(a);
		i=a;
	}
	

	public static void main(String[] args)
	{
		System.out.println("main method of ConsDemo8A");
		ConsDemo8A C1=new ConsDemo8A(15);
		//System.out.println(C1.i);
		ConsDemo8A C2=new ConsDemo8A(25);
		//System.out.println(C2.i);
		System.out.println("done");
		
		

	}

}
