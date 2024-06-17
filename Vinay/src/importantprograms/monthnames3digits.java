package importantprograms;

public class monthnames3digits {

	public static void main(String[] args) 
	{
		String s1="january,february,march,April,may,june,july,august,sepetember,october,november,decemebr";
		String str[]=s1.split(",");
		
		for(int i=0;i<str.length;i++)
		{
		
			String Substring1=str[i].substring(0,3);   //substring(str[i].length() - 3);
			System.out.println(Substring1);
			
		}
		String s2="vinay";
		String s3="chatur";
		System.out.println(s2+s3);
		 
	
	}

}
