package logicprograms;

public class SwapNumbers 
{
	static int a=10;
	static int b=20;

	public static void main(String[] args) 
	{
		int c=a; //with using temporary variable
		a=b;
		b=c;
	  //int c=b; //with using temporary variable
	  //b=a;
	  //a=c;
//		a=a+b; //without using temporary variable
//		b=a-b;
//		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
