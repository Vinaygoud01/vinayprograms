package logicprograms;

public class Split 
{

	public static void main(String[] args) 
	{
		String s1 = "Think like a compiler";
		
		String arr[] = s1.split(" ");
		System.out.println(arr.length);
		for(String ss : arr) //Assigning the values of arr to ss by using : operator
		{
			System.out.println(ss);
			
		}
		
		StringBuffer s2 = new StringBuffer();
		s2.append(s1);
		s2.reverse(); //complete statement will be in reverse. "relipmoc a ekil knihT"
		System.out.println(s2);

	}

}
