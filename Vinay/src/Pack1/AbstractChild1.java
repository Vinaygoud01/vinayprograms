package Pack1;

public  class AbstractChild1 extends AbstractDemo1
{
	AbstractChild1()
	{
		System.out.println("cons of AbstractChild1");
	}

	public static void main(String[] args) 
	{
		AbstractChild1 ab1=new AbstractChild1();
		ab1.funC();
	}
	@Override
	void funA()
	{
		
	}
	@Override
	void funB()
	{
		
	}

}
