package JAVA;

public class ArrayDemo8 {

	public static void main(String[] args)
	{
		ArrayDemo8 a1=new ArrayDemo8();
		int k[]={10,20,30};
		a1.funA(k);
		

	}
	public void funA(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
