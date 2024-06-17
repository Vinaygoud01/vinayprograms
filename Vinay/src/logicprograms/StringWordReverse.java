package logicprograms;



public class StringWordReverse {

	public static void main(String[] args) 
	{
		String s = "my name is sai";
		String a[] = s.split(" "); //we are splitting the given string with space
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
