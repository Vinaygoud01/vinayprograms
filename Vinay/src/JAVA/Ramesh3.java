package JAVA;

public class Ramesh3 {

	public static void main(String[] args)
	{
		Ramesh3 r1=new Ramesh3();
		//r1.addNumbers();  //Zero parameterised
		r1.addNumbers(10,20);
		r1.addNumbers(30,40);
		}
	void addNumbers(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	

}
