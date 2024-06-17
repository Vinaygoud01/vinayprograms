package JAVA;

public class ObjectDemo2 
{
	int a=10;
	boolean b=true;
	static int c=20;

	public static void main(String[] args)
	{
		System.out.println(c);
		new ObjectDemo2(); //create an object loads only non static members
		System.out.println(a);  //error bcz when object then we have to give the address otherwise error
		System.out.println(b);
		
		int i=new ObjectDemo2(); //error bcz it wont loads all the values in the object
		boolean j=new ObjectDemo2(); //error
		

	}

}
