package logicprograms;

public class TwoStringsCharSimultanious 
{

	public static void main(String[] args) 
	{
		String s = "java";
		String b = "selenium";
		String result = "";

		// Interleave the characters of s and b
		for (int i = 0; i < Math.min(s.length(), b.length()); i++) {
		    result += s.charAt(i) + "" + b.charAt(i);
		}

		// Add any remaining characters from the longer string
		if (s.length() > b.length()) {
		    result += s.substring(b.length());
		} else {
		    result += b.substring(s.length());
		}

		System.out.println(result);

	}

}
