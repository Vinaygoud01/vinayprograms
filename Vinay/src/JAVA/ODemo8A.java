package JAVA;

public class ODemo8A {

	public static void main(String[] args) 
	{
		ODemo8A d1=new ODemo8A();
		d1.funA(10);  //calling fun A
		d1.funB(true);
		
		variabledemo1 k=new variabledemo1();
		d1.func(k); //for every non-primitive datatype we can the function by using address or null valueor object
	    d1.func(new variabledemo1());
	    d1.func(null);
	    

	}
	void funA(int a)
	{
		
	}
	void funb(boolean b)
	{
		
	}
	void func(variabledemo1 v1)
	{
		
	}
	void funD(MethodDemo1 m1)
	{
		
	}
	MethodDemo1 D = new methodDemo1();
	d1.funD(D);
	d1.funD(new methodDemo1());
	d1.funD(null);
}
