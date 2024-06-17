package JAVA;

public class ConsDemo12
{
	int a=5;
	int b=10;
	ConsDemo12 (int a,int b)
	{
		this.a=a;  //this keyword is perform like a reference variable
		this.b=b;  //this keyword is pointing to current object
	}

	public static void main(String[] args)
	{
		System.out.println("Main method of ConsDemo12");
		ConsDemo12 C1=new ConsDemo12(20,30);
		System.out.println(C1.a);
		System.out.println(C1.b);
		System.out.println("done");
		
	

	}

}
