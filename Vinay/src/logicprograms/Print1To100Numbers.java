package logicprograms;

public class Print1To100Numbers 
{

	public static void main(String[] args) 
	{
		funA(1);
		

	}
	static void funA(int b)
	{
		if (b<=100) //without using increment and loop 
		{
			System.out.println(b); 
			funA(b+1);   
	         }
	
//	for (int i=1; i<=100; i++) // by using for loop
//	{
//		System.out.println(i);
//	}
//	
	}
	}



