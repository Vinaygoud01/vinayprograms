package logicprograms;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		int num = 45654;
		int temp = num;
		int rev=0;
		while(num>0)
		{
			int remainder = num%10;
			rev = rev*10+remainder;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Given number "+ temp +" is palindrome");
		}
		else
		{
			System.out.println("Given number "+ temp +" is not palindrome");
		}

	}

}
