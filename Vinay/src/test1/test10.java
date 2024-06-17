package test1;

public class test10 {

	public static void main(String[] args) 
	{
		funA(false);
		

	}
	static void funA(boolean b1)
	{
		if(b1=true)  //if(b1==true)  then else block will execute
		{
		System.out.println("statement is correct");
		}
		else
		{
			System.out.println("statement is not correct");
		}
	}

}
