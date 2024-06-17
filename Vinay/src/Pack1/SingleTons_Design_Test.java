package Pack1;

public class SingleTons_Design_Test 
{
	public static void main(String[] args)
	{
		SingleTons_Design_Demo1 s1 =SingleTons_Design_Demo1.funA();
		SingleTons_Design_Demo1 s2=SingleTons_Design_Demo1.funA();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
