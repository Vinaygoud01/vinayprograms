package Pack1;

public class PrivateDemo1 
{
	private int a=10;
	
	private void funA()
	{
		System.out.println("funA of PrivateDemo1");
	}
	void funB()
	{
		System.out.println("funB of PrivateDemo1");
		System.out.println(a);
		funA();
	}

}
