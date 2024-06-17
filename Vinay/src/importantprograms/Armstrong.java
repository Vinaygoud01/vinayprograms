package importantprograms;

public class Armstrong  //Armstrong number is a number that is equal to the sum of cubes of its digits.
{
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int rem,sum=0;
		while(n>0) //it should be in loop until the condition get satisfied
		{
			rem=n%10; //getting the last digit //3 //5 //1
			sum=sum+rem*rem*rem; //power will be based on the given digits //27+125=152 //153
			n=n/10; //eliminating the last digit //15 //1 //0
			
		}
		if(temp==sum) //comparing the two numbers //153==153
		{	
			System.out.println(temp + " is Armstrong number");
		}
		else
		{
			System.out.println("not arm strong");
		}
	}
}
