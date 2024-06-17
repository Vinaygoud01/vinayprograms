package logicprograms;


import java.util.HashSet;
import java.util.Set;



public class DuplicateIntStringArray 
{

	public static void main(String[] args) 
	{
		int a[] = {4,5,7,5,9,11,4};

		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++)
			{
				set.add(a[i]);
			}
		System.out.println(set);
		
		String s[] ={"sai", "java","sai"};
		Set<String> setS = new HashSet<String>();	
		for(int i=0; i<s.length; i++)
		{
			setS.add(s[i]);
		}
		System.out.println(setS);

	}

}
