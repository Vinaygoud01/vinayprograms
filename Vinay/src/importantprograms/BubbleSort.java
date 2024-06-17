package importantprograms;

import java.util.Arrays;

public class BubbleSort 
{
	//Bubble sort is a type of sorting algorithm you can use to arrange a set of values in ascending order

	public static void main(String[] args) 
	{
		int a[] = {20,5,8,3,47,17,7,67}; // We will perform n-1 passings
		System.out.println("Array before sorting: "+Arrays.toString(a));
		int n = a.length;
		int temp = 0;
	/*	for(int i=0; i<n; i++)
		{
			for(int j=1; j<n-i; j++)
			{
				if(a[j-1]>a[j])
				{
					temp = a[j]; 
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}*/
		for(int i=0; i<n-1; i++) //Here we are passing the loop
		{
			for(int j=0; j<n-1; j++) // Here we are iterating the loop
			{
				if(a[j]>a[j+1]) //Here I will check the condition of two numbers
				{
					temp = a[j];  // swapping happens in these three statements
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}
}
