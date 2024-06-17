package logicprograms;

public class StringUpperCaseAndLowerCase 
{

	public static void main(String[] args) 
	{
		String s = "Welcome To AutoMatioN Interview";
		int lower=0;
		int upper=0;
		for(int i=0; i<s.length(); i++)
		{
			char cr = s.charAt(i);
			if(cr>=65 && cr<=96)
			{
				upper++;
			}
			else
			{
				lower++;
			}
					
		}
		System.out.println("Lower case letters are: "+lower);
		System.out.println("Upper case letters are: "+upper);
	}

}
