package Pack1;

public class SingleTons_Design_Demo1 
{
	static SingleTons_Design_Demo1 s1=null;
	
	private SingleTons_Design_Demo1()
	{
		
	}
	public static SingleTons_Design_Demo1 funA()
	{
		if(s1==null)
		{
			s1=new SingleTons_Design_Demo1();
		}
		return s1;
	}

}
