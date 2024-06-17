package logicprograms;

public class StringEvenRev 
{

	public static void main(String[] args) 
	{
		String str = "This is selenium class";
		String[] words = str.split(" ");
		String result = "";
		String k = "";
		for(int i=0; i<words.length; i++) 
		{
			if(i%2 == 0)
				System.out.print(" " + words[i] + " ");
			else
				result = words[i];
// each character of the even word from string will iterate in this loop from end to begin
			for (int j = result.length()-1; j >= 0; j--)  // is & class will iterate in this loop
			{
				k = "" + result.charAt(j);
				System.out.print(k); //si //ssalc
			}
			result = "";
		}   

	}
}
