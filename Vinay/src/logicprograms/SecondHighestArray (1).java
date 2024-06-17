package logicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SecondHighestArray {

	public static void main(String[] args) 
	{
		int[] numbers = {100, 5, 27, 15, 25, 5,27};

		Set<Integer> set = new HashSet<Integer>();

		for(int i=0; i<numbers.length; i++)
		{
			set.add(numbers[i]);
		}

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int num : numbers) //assigning values available in numbers to num
		{
			numList.add(num); //we are adding values available in num into numList
		}

		// Sort the ArrayList in descending order
		Collections.sort(numList, Collections.reverseOrder());

		// Get the second element in the ArrayList
		int secondHighest = numList.get(1);

		System.out.println("Second highest number is: " + secondHighest);

	}

}
