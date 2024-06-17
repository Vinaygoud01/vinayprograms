package test4;

public class test15 {

	public static void main(String[] args)
	{
//	   // String s1="RBG technologies";
//	    String s1="1234";
//	    StringBuilder s2=new StringBuilder();
//		s2.append(s1);
//		s2.reverse();
//		System.out.println(s2);
//	
//		String str[]=s1.split("");
//		String s3=str[0];
//		String s4=str[1];
//		String s5=str[2];
//		String s6=str[3];
//		
//		System.out.println(s4+s3+s6+s5);
		
		
		
//		
		String s1="1234";
		String s2[]=s1.split("");
		
		String s3=s2[0];
		s2[0]=s2[1];
		s2[1]=s3;
		
		String s4=s2[2];
		s2[2]=s2[3];
		s2[3]=s4;
		
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);
		System.out.println(s2[0]+s2[1]+s2[2]+s2[3]);
	
		
	
	}

}
