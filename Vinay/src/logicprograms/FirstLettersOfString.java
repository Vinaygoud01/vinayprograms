package logicprograms;

public class FirstLettersOfString 
{

	

	public static void main(String[] args) 
	{
		/*String str = "This is Selenium Test";
		
		funA(str);
	}
		public static void funA(String str)
		{
		String arr[] = str.split(" ");
		
		for(int i = 0; i<=2; i++)
		{
		String s2 = arr[i];

System.out.println(s2.charAt(0));
		}
		System.out.println(arr[3]);*/
		
		String str = "This is Selenium Test";
		String arr[] = str.split(" ");
		String rev = "";
		
		for(int i = 0; i<=2; i++)
		{
			
			String s1 = arr[i];
			char abc = s1.charAt(0);
			rev = rev+abc+"";
		}
		String s2 = arr[3];
			
			System.out.println(rev+s2);
		}
		
		
		}
		
		
		

	






