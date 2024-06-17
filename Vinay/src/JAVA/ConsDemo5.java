package JAVA;

public class ConsDemo5
{
	int i=10;
	ConsDemo5()
	{
		System.out.println("cons of ConsDemo5");
		int a=15; //here a is updating value to global variable
		i=a;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo5");
		ConsDemo5 C1=new ConsDemo5();
		System.out.println(C1.i);
		System.out.println("done");
		

	}

}
