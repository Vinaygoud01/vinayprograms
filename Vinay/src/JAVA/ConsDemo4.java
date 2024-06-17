package JAVA;

public class ConsDemo4
{
	
	ConsDemo4()
	{
		System.out.println("cons of ConsDemo4");
		int a=15;  //here a is local variable it wont load in the object
	}
	public static void main(String[] args)
	{
		System.out.println("main method of ConsDemo4");
		ConsDemo4 C1=new ConsDemo4();
		//System.out.println(C1.a);
		System.out.println("done");
		

	}

}
