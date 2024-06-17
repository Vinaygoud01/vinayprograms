package JAVA;

public class Parameterised {

	public static void main(String[] args)
	{
		Parameterised m1=new Parameterised();
		m1.vinay(10,false,10,12.56,'v',12);
		m1.funA(10);
		m1.funB(false);
		m1.funC(10);
		m1.funD(12.56);
		m1.funE('v');
		m1.funF(12);
	}
	void vinay(int a,boolean b,float f,double d,char c,long l)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(l);
	}
	void funA(int a)
	{
		System.out.println(a);
	}
	void funB(boolean b)
	{
		System.out.println(b);
	}
	void funC(float f)
	{
		System.out.println(f);
	}
	void funD(double d)
	{
		System.out.println(d);
	}
	void funE(char c)
	{
		System.out.println(c);
	}
	void funF(long l)
	{
		System.out.println(l);
	}

}
