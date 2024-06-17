package JAVA;

public class ArrayDemo6 {

	public static void main(String[] args)
	{
		ArrayDemo6 a1=new ArrayDemo6();
		int k[]={10,20,30,40,50,60};
		//int a=10; int b=20; int c=30; int d=40;int e=50;
		a1.funA(k);
	}
	//void funA(int a,int b,int c,int d,int e)
	void funA(int arr[])
    {
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		//System.out.println(a);
	}

}
