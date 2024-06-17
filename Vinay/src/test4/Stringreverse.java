package test4;

public class Stringreverse {

	public static void main(String[] args) 
	{
		String s1="this is selenium class";
		String str[]=s1.split(" ");
		System.out.println(str[1]);
		System.out.println(str[3]);
		String s2=str[0];
		String s3=str[1];
		String s4=str[2];
		String s5=str[3];
	
	
		StringBuilder b1=new StringBuilder();
		b1.append(s3);
		b1.reverse();
		System.out.println(b1);
		StringBuilder b2=new StringBuilder();
		b2.append(s5);
		b2.reverse();
		System.out.println(b2);
		
		System.out.println(s2+" "+b1+" "+s4+" "+b2);
		
//		for (int k=0;k<str.length;k++)
//		{
//			StringBuffer str1=new StringBuffer(str[k]);
//			if(k%2!=0)
//			{
//				System.out.println(str1.reverse());
//			}
//			else
//			{
//				System.out.println(str1);
//			}
//			
		}
		
		
		

	}


