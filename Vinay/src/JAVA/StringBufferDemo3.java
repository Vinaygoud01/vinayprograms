package JAVA;

public class StringBufferDemo3 {

	
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("RBG ");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("tech ");
		System.out.println(s2);
		System.out.println(""+s1+s2);
		
		String s3=new String("abc");
		String s4=new String("def");
		System.out.println(s3+s4);

	}

}
