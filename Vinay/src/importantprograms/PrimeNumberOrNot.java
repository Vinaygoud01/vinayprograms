package importantprograms;

public class PrimeNumberOrNot{

	public static void main(String[] args) 
	{
		prime(12);  //397;
		
	}
	
	public static void prime(int num){
		
		int count=0;
		for (int i=1;i<=num;i++) //prime numbers are divisible by one and it self
			//here for iterates 11 times
		{
			if(num%i==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime number");
		}

	}

}
