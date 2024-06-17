package JAVA;

public class ArrayDemo7 {

	public static void main(String[] args)
	{
		ArrayDemo7 a1=new ArrayDemo7();
		int arr[]=a1.funA();
		System.out.println(arr[2]);
		System.out.println(a1.funA()[3]);
	}
	//int funA()
	int[] funA()
	{
		int k[]={10,20,30,40,50};
		return k;
	}

}
