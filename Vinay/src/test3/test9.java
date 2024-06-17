package test3;  //print i value in the main method from index 2 which is test function

//public class A
//{
//	int i=10;
//}

public class test9 {

	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1.i);
		
		test9 t1=new test9();
		A s[]=t1.testfunction();
		System.out.println(s[2].i);
		System.out.println(t1.testfunction()[2].i);
			
	}
		
	A[] testfunction()  //A[] testfunction()=rbg;
	{
		A rbg[]={new A(),new A(),new A()};
		
		return rbg;
	}

}
