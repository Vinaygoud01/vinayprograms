package JAVA;

public class MethodDemo9 {

	public static void main(String[] args) 
	{
		MethodDemo9 m1=new MethodDemo9();
		m1.funA();
		m1.funA();
		System.out.println("done");
	}
	void funA()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	int funB()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return 3000; //a;b;c;10;
		//we can use the method signature as a variable from return data type function/method syntax
		//for the signature initialization will done by return keyword
	}

}
