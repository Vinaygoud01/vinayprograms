package Pack1;

public abstract class AbstractDemo1
{
	AbstractDemo1()
	{
		System.out.println("cons of AbstractDemo1");
	}

	public static void main(String[] args) 
	{
	//	AbstractDemo1 ab1=new AbstractDemo1();
	//	ab1.funC();  //bcz funA and funB are unimplemented abstract keyword is used
	}
	void funC()
	{
		System.out.println("funC");
	}
	abstract void funA();   //unimplemented methods
	abstract void funB();

}
