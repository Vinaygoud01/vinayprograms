package JAVA;

public class VariableDemo3
{
	int i=10;
	static int j=20;
	

	public static void main(String[] args) 
	{
		System.out.println(j);
		j=30;  //assigning j value 30
		System.out.println(j);  //30
		int j=40;
		System.out.println(j);  //40bcz of local variable value
		//System.out.println(k);  //error bcz no declaration
		
	//System.out.println(i);  //i non static member we have to convert it to ML
	// to get i value we have to create an object
	
	VariableDemo3 v1=new VariableDemo3();
	System.out.println(v1.i);
	System.out.println(v1);

	}

}
