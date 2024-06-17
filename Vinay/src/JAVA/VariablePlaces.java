package JAVA;

public class VariablePlaces
{
	int a=10;  //2nd palce-  non static variables
	static int b=20; //5th palce static variables

	public static void main(String[] args) 
	{
		int a=10;  //1st palce  loacl variables
	}
	public void funA(int c)  //3rd palce  parameterised variable
	{
		
	}
	int good()
	{
		int d=12;
		return d;  //4th palce  *return variable
	}

}
