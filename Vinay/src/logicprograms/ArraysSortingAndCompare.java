package logicprograms;

import java.util.Arrays;

public class ArraysSortingAndCompare 
{

	public static void main(String[] args) 
	{
		int[] a1 = {2,5,7,1,3};
		int[] a2 = {5,3,7,1,2};
		int temp;
		
		//sorting the first array a1
		for(int i=0; i<a1.length-1; i++) //Here we are passing the loop
		{
			for(int j=0; j<a1.length-1; j++) // Here we are iterating the loop
			{
				if(a1[j]>a1[j+1]) //Here I will check the condition of two numbers
				{
					temp = a1[j];  // swapping happens in these three statements
					a1[j] = a1[j+1];
					a1[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1));
		
		//sorting the second array a2
		
		for(int i=0; i<a2.length-1; i++) //Here we are passing the loop
		{
			for(int j=0; j<a2.length-1; j++) // Here we are iterating the loop
			{
				if(a2[j]>a2[j+1]) //Here I will check the condition of two numbers
				{
					temp = a2[j];  // swapping happens in these three statements
					a2[j] = a2[j+1];
					a2[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a2));
		
		//comparing the arrays length
//		int size1 = a1.length;
//		int size2 = a2.length;
//		if(size1==size2)
//		{
//			System.out.println("Length of the arrays are matching");
//		}
//		else
//		{
//			System.out.println("Length of the arrays are not matching");
//		}
		
		//comparing the array values
		boolean equal = Arrays.equals(a1, a2);
		System.out.println("Given arrays a1 and a2 are equal: " + equal);
		

	}

}
