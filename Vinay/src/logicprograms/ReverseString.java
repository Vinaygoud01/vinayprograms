package logicprograms;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String s1 = "HELLO";
		String rev="";
//		Using + (String concatenation) operator
		
		int len = s1.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println("Reversed string is:"+ rev);
		
// Using character array
		
		char a[] = s1.toCharArray();
		int size = a.length;
		for(int i = size-1; i>=0; i--)
		{
			rev = rev+a[i];
		}
		System.out.println("Reversed string is:" +rev);
		
//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("Reversed string is:" +sb.reverse());

		
		
	}

}
