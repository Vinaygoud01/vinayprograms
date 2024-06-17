package JAVA;

public class ObjectDemo5 
{
	int a=10;
	boolean b=true;
	static int c=20;

	public static void main(String[] args) 
	{
		System.out.println(c);
		int i=10;  //initialization
		ObjectDemo5 o1=new ObjectDemo5(); //instantiation
		System.out.println(i);
		System.out.println(o1);  //it will give object address
		
		ObjectDemo5 o2=new ObjectDemo5();  //every time creating new objects then it will give new Address
		System.out.println(o2);
		
		//object reference variable contains the Address or .....
		

	}

}
