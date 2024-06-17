package logicPrograms;

import java.util.Random;

public class AlphaNumerical 
{
	

	public static void main(String[] args) 
	{
		String Letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Digits = "0123456789";
		String Alphanumeric = Letters + Digits;
		int LENGTH = 10;
		Random random = new Random();
		char[] alphanumericChars = new char[LENGTH];
		for (int i = 0; i < LENGTH; i++) 
		{
			int index = random.nextInt(Alphanumeric.length());
			alphanumericChars[i] = Alphanumeric.charAt(index);
		}
		String alphanumeric = new String(alphanumericChars);
		System.out.println("Alphanumeric: " + alphanumeric);
	}

}
