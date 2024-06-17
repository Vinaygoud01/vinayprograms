package logicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) 
	{
		//Approach 1
	/*	int a[] = {20,5,8,32};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a)); */
		
		//Approach 2
	/*	int a[] = {7,5,8,32};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a)); */
		
		//Approach 3
		Integer a[] = {7,5,8,32};
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting: "+Arrays.toString(a));

	}

}
