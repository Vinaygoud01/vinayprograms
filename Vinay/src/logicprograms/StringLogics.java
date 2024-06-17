package logicprograms;

public class StringLogics 
{

	public static void main(String[] args) 
	{
		String s1 = "RBG technologies exam";
		
		int size = s1.length(); // length return should be int.
		System.out.println(size);
		
		char ch[] = s1.toCharArray(); //toCharArray return type should be char.
		System.out.println(ch[5]);
		
		char c = s1.charAt(0); //charAt return type should be char
		System.out.println(c);
		
		String str[] = s1.split("e"); // split return type should be string.
		System.out.println(str.length);
		
		boolean verifyWithcase = s1.equals(""); //equal return type should be boolean for both case sensitive and non sensitive.
		System.out.println(verifyWithcase);
		boolean verifyWithnoncase = s1.equals("");
		System.out.println(verifyWithnoncase);
		
		String sub1 = s1.substring(4); // substring(int beginindex) return type should be string.
		System.out.println(sub1);
		
		String sub2 = s1.substring(0, 3); //substring(int beginindex, int endindex) return type should be string.
		System.out.println(sub2);
		

	}

}
