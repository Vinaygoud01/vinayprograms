package logicprograms;

public class EvenWordsRev 
{

	public static void main(String[] args)
	{
		String s1 ="This is Selenium class";
		String str[] = s1.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i%2!=0)
			{
				String s=str[i];
				String r="";
				for(int j=0; j<s.length(); j++)
				{
				r = s.charAt(j)+r;
				}
				System.out.println(r);
				
			}
			else
			{
			System.out.println(str[i]);
			}
			
				
			
		}
		
				

	}

}
