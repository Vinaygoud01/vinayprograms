package logicprograms;
public class Vowels {

	public static void main(String[] args) 
	{
		String vowels = "Mansanpally Sai";
		for(int i=0; i<vowels.length(); i++)
		{
			if(vowels.charAt(i)=='a'||vowels.charAt(i)=='e'||vowels.charAt(i)=='i'||vowels.charAt(i)=='o'||vowels.charAt(i)=='u')
			{
				System.out.println("Given string "+vowels.charAt(i)+" is at "+i);
			}
		}
	}
}
