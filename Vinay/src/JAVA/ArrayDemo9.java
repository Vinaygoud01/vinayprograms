package JAVA;

public class ArrayDemo9 {

	public static void main(String[] args)
	{
		int arr[][]=new int[4][5];  //rows and columns
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[1][3]=80;
		
		arr[2][0]=90;
		arr[2][1]=100;
		arr[2][2]=110;
		arr[2][3]=120;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}

	}

}
