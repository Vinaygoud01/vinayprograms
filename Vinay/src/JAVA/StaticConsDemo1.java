package JAVA;

public class StaticConsDemo1 {
	int i=1;
	static int j=1;
	 
	StaticConsDemo1()
	{
		i++;
		j++;
	}

	public static void main(String[] args) {
		System.out.println(j);
		
		StaticConsDemo1 d1=new StaticConsDemo1();
		System.out.println(d1.i);
		System.out.println(d1.j);
		
		StaticConsDemo1 d2=new StaticConsDemo1();
		System.out.println(d2.i);
		System.out.println(d2.j);
		
		System.out.println(j);
		
	

	}

}
