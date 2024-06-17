package logicprograms;

import java.util.HashSet;

public class DuplicateStringUsingHashSet 
{

	public static void main(String[] args) 
	{
		String input[] = {"sai", "ram", "sai"};
		HashSet<String> duplicate = new HashSet<String>();
		for(String i :input)
		{
			if (!duplicate.add(i))
			{
				System.out.println("Duplicate string is : " +i);
			}
		}
		

	}

}
