package JAVA;

public class ArrayDemo2 {

	public static void main(String[] args)
	{
		int arr[]=new int[5];
		arr[0]=10;
		System.out.println(arr[0]);
		arr[1]=20;
		System.out.println(arr[1]);
		arr[2]=30;
		System.out.println(arr[2]);
		
		System.out.println(arr[3]);  //we  havent assigned any value by default it will give 0
		System.out.println(arr[4]);  //we  havent assigned any value by default it will give 0
		System.out.println(arr[5]);   //Arrayindex out of boundException
		

	}

}
