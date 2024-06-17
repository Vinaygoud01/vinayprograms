package JAVA;

public class StringDemo4A {

	public static void main(String[] args)
	{
		String s1="  RBG technologies  ";
		System.out.println(s1);
		s1.trim();
		System.out.println(s1.trim());
		
		String s2="rbg technologies";
		System.out.println(s2);
		s2.toUpperCase();
		System.out.println(s2.toUpperCase());
		
		String s3=s1.trim();
		System.out.println(s3);
		
		String s4=s2.toUpperCase();
		System.out.println(s4);
		

	}

}
