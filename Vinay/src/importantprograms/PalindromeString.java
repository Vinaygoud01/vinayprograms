package importantprograms;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		String str = "Malayalam";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) //(str.toLowerCase.euqals(rev.toLowerCase())
		{
			System.out.println("Given String value " + rev + " is palindrome");
		}
		else
		{
			System.out.println("Given String value " + rev + " is not palindrome");
			
		}
		

	}

}
