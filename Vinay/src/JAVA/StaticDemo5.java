package JAVA;

public class StaticDemo5
{
	int a=10;
	static int b=20;
	

	public static void main(String[] args)
	{
		System.out.println("main method start");
		System.out.println(b);
		//funB();
		//StaticDemo5 s1=new StaticDemo5();
		//s1.funA();
		//System.out.println(s1.a);
	}
		int funA()
		{
			System.out.println("fun A of StaticDemo5");
			return 10;
		
		}
			static int funB()
			{
				System.out.println("funB of staticDemo5");
				return 20;
			}
		
		


}



