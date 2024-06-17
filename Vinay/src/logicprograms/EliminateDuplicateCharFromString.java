package logicprograms;

public class EliminateDuplicateCharFromString 
{

	static String s = "My name is Sai";
	
	
	public static void main(String[] args) 
	{
		
		String result = duplicate(s);
		System.out.println(result);
		

	}
	public static String duplicate(String str)
	{  
		s = s.toLowerCase();
		char[] chars = s.toCharArray();
	    int length = chars.length;
	    for (int i = 0; i < length; i++) {
	        for (int j = i + 1; j < length; j++) {
	            if (chars[i] == chars[j]) {
	                chars[j] = '\0';
	            }
	        }
	    }
	    return new String(chars).replaceAll("\0", " ");
	}

}
