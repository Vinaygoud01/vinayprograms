package logicprograms;

public class ReverseNumber 
{  
	public static void main(String[] args)   
	{  
	int number = 987654, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  //4 //5 //6 //7 //8 //9
	reverse = reverse * 10 + remainder; //456789
	number = number/10;  //98765 //9876 //987 //98 //9 //0
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	

}
