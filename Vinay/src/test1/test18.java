package test1;

public class test18 {

	public static void main(String[] args) {
		test18 t1=new test18();
		t1.funA(125,198,287);

	}
	void funA(int a,int b,int c)
	{
		if(a>=b && a>=c)
		{
			System.out.println("the greatest number is\n" +a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("the greatest number is\n" +b);
		}
		else
		{
			System.out.println("the greatest number is\n" +c);
		}
	}

}
