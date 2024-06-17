package JAVA;

public class DataTypeCastingDemo4 {

	public static void main(String[] args) 
	{
		int a=10;
		float f1=a; //implicit data type casting
		long l=3000; //long l=10001;
		float f2=1;
		double d=30;
		double d1=f2;
		
		//float f4=10.237896578;//we can write like this also
	float f3=(float)10.237896578;
	int b=(int)f1;
	long k=(long)f1;
	double d2=10.23;
	int c=(int)d;  //Explicit data type casting
	long m=(long)d;
	float f4=(float)d;

	}

}
