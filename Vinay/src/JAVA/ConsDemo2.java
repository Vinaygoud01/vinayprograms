package JAVA;

public class ConsDemo2
{
	ConsDemo2()
	{
		System.out.println("cons of ConsDemo2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo2 C1=new ConsDemo2();
		System.out.println("done");
		
		new ConsDemo2();
		new ConsDemo2();
		new ConsDemo2();
		
		
		

	}

}
