package test3;

public class test5 
{
	static int rbg=1;
	test5()
	{
		System.out.println("cons of test5 is invoking");
		rbg=rbg+1;
	}

	public static void main(String[] args)
	{
		System.out.println(rbg);
		new test5();
		new test5();
		new test5();
		System.out.println(rbg);
	

	}

}
