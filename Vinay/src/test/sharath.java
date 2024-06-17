package test;

public class sharath {

	public static void main(String[] args)
	{
		String s1="january,february,march,April,may,june,july,august,sepetember,october,november,decemebr";
		String str[]=s1.split("a");
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i].toUpperCase());
		}

		

	}

}
