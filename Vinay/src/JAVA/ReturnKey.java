package JAVA;

public class ReturnKey
{

	public static void main(String[] args)
	{
		ReturnKey r1=new ReturnKey();
		int a=r1.vinay();  //r1.vinay();  
		System.out.println(a);   //System.out.println(r1.vinay());
		float b=r1.vinay1();  //r1.vinay1();
		System.out.println(b);   //System.out.println(r1.vinay1());
	}
	int vinay()
	{
		int a=40;
		int b=50;
		return a+b;
	}
	float vinay1()
	{
		int a=40;
		int b=50;
		return a+b;
	}

}
