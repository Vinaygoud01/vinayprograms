package logicPrograms;

import java.util.HashSet;

public class DuplicateIntegerUsingHashSet 
{

	public static void main(String[] args) 
	{
		int in[] = {1,2,3,4,1,5,9,2};
		HashSet<Integer> dup = new HashSet<Integer>();
		for(int i=0; i<in.length; i++)
		{
			for(int j=1; j<in.length; j++)
			{
				if(in[i]==in[j]&&i!=j)
				{
					dup.add(in[i]);
					break;
				}
			}
		}
		System.out.println(dup);

	}

}
