package JAVA;

public class StringBufferDemo2 {

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("RBG");
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("technologies");
		System.out.println(s2);
		//System.out.println(s1+s2); string is different stringbuffer is different here it performs no arithimatic nor concatination
		
		
		//StringBuffer s5=s1.append(s2);
		//System.out.println(s5);
		System.out.println(s1.append(s2));
		
		String s3=new String("abc");
		String s4=new String("def");
		System.out.println(s3+s4);
		

	}

}
