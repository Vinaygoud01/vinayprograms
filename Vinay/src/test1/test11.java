package test1;

public class test11
{
	int i=10;

	public static void main(String[] args)
	{
		test11 t1=new test11();
		t1.funA();
		System.out.println(t1.i);

	}
	void funA()
	{
		System.out.println(i);
		i=5;
	}

}
