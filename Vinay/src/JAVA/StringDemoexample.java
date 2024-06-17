package JAVA;

public class StringDemoexample {

	public static void main(String[] args)
	{
		String s1="{[('abc':'123')]},{[('def':'456')]},{[('ghi':'789')]}";
		System.out.println(s1.length());
		
		String replace=s1.replace(":","=");
		System.out.println(replace);
		String[] str=replace.split(",");
		for(String s2:str)
		{
			System.out.println(s2);
		}
		
		String substring1=replace.substring(4, 13);
		System.out.println(substring1);
		String[] str1=substring1.split("'");
		for (String s3:str1)
		{
		System.out.println(s3);
		}
    	
		String substring2=replace.substring(22,31);
		System.out.println(substring2);
		String[] str2=substring2.split("'");
		for (String s4:str2)
		{
		System.out.println(s4);
		}
		
		String substring3=replace.substring(40,49);
		System.out.println(substring3);
		String[] str3=substring3.split("'");
		for (String s5:str3)
		{
		System.out.println(s5);
		}
		
		
    	
	
//		System.out.println("no of words:" +str.length);
//		
//		for(int i=0;i<str.length;i++)
//		{
//			System.out.println(str[i]);
//		}
		

	}

}
