package importantprograms;

public class PalindromeNumber 
{
	//A number that remains same even if its digits are reversed, is called a palinDrome number.

	public static void main(String[] args) 
	{
		int num = 1221;
		int temp = num;
		int rev=0;
	 //   for (; num != 0; num=num/10)
		while(num>0)
		{
			int remainder = num%10; //1 //2 //2 //1
			rev = rev*10+remainder; //1 //12 //122 //1221
			num=num/10; //122 //12 //1 //0
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
