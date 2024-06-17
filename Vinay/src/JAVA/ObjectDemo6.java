package JAVA;

public class ObjectDemo6
{
	//A a=new A();
	//static ObjectDemo6 o1=new ObjectDemo6();

	public static void main(String[] args)
	{
		System.out.println("main method");
		funA();
		//ObjectDemo6 o1=new ObjectDemo6();
		//o1.funA();
		

	}
	void funA()
	{
		System.out.println("funA");
		//A a1=new A();
		//funB();
	}
	static void funB()
	{
		System.out.println("fun b");
		//ObjectDemo6 o1=new ObjectDemo6();
	}

}
