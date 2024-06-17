package logicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args) 
	{
		String s[] = {"sai","Hyderabad","Telangana","India"};
		String temp;
		for(int i=0; i<=s.length-1; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				//compares each elements of the array to all the remaining elements 
				if(s[i].compareToIgnoreCase(s[j])>0)
				{
					//swapping array elements
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;	
				}
			}
		}
		//prints the sorted array in ascending order
		System.out.println(Arrays.toString(s));

		
//WE have another method for sorting by using sort() in ascending order.
		String[] fruits = {"Banana","Kiwi","Grapes","Apple", "Mango"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
//WE have another method for sorting by using sort() in decending order.
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		

	}

}
