package logicprograms;

public class WordReverse 
{

	public static void main(String[] args) 
	{
		String str = "This is Selenium Test";
		String arr[] = str.split(" ");
		String rev = "";
		for(int i=arr.length-1; i>=0; i--)
		{
//			System.out.println(arr[i]);
		
			rev = rev+arr[i]+" ";
		}
		System.out.println(rev);

	}

}
