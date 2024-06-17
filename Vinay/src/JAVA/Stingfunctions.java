package JAVA;

public class Stingfunctions {

	public static void main(String[] args) 
	{
		String s1="RBG technologies";

		int size=s1.length();
		System.out.println(size);
		
		char c1=s1.charAt(5);
		System.out.println(c1);
		
		char crr[]=s1.toCharArray();
		System.out.println(crr[7]);
		
		String str[]=s1.split(" ");
		System.out.println(str[0]);
		String str1[]=s1.split("e");
		//System.out.println(str1);
		String replace=s1.replace("e","@");
		System.out.println(replace);
		
		String substring1=s1.substring(3);
		System.out.println(substring1);
		
		String substring2=s1.substring(0,3);
		System.out.println(substring2);
		
		String substring3=s1.substring(3,5);
		System.out.println(substring3);
		
		
		

	}

}
