package importantprograms;

public class DuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String s = "mynameissai";
		int size=s.length();
		System.out.println(size);
		char c[] = s.toCharArray();  //changes the data into array & then uses it
		
		for(int i=0; i<c.length;i++)
		{
			for(int j=i+1; j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]);
					break;
				}
			}
		}
	}

}
