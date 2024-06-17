package JAVA;

public class ConsDemo7 
{
	ConsDemo7(int a)
	{
		System.out.println("cons of ConsDemo7");
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo7");
        //ConsDemo7 C1=new ConsDemo7();  //error bcz we need to give an input
		ConsDemo7 C1=new ConsDemo7(20);
		System.out.println("done");
		

	}

}
