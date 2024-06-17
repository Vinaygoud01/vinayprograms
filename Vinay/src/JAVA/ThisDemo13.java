package JAVA;

public class ThisDemo13
{
	ThisDemo13 funA()
	{
		ThisDemo13 t1=new ThisDemo13();
		return t1;
	}
	ThisDemo13 funB()
	{
		return new ThisDemo13();
	}
	ThisDemo13 funC()
	{
		return null;
	}
	ThisDemo13 funD()
	{
		return this;
	}




	
}
