package JAVA;

public class TostringDemo1 
{
	int a=10;
	String s1="rbg technologies";

	public static void main(String[] args)
	{
		System.out.println("main method");
		TostringDemo1 t1=new TostringDemo1();
		System.out.println(t1);
		System.out.println("done");
		

	}
	public String toString()
	{
System.out.println("toString of TostringDemo1 ");
return a+" "+s1;
	}
public void funA()
{
System.out.println("funA of TostringDemo1");
}
public int funB()
{
System.out.println("funB of TostringDemo1");
return a;
}

}
