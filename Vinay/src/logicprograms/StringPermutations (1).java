package logicPrograms;

public class StringPermutations 
{

	public static void main(String[] args) 
	{
		String s = "dog";
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) 
		{
			for (int j = 0; j < chars.length; j++) 
			{
				for (int k = 0; k < chars.length; k++) 
				{
					if (i != j && i != k && j != k) 
					{
						System.out.println("" + chars[i] + chars[j] + chars[k]);
					}
				}
			}
		}
	}
}
