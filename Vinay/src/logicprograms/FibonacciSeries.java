package logicprograms;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int a=0, b=1, c, n=10;
		System.out.print(a+" "+b);
		//System.out.println(b);
		for(int i=3; i<=n; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}

	}

	}


