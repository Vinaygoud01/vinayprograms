package importantprograms;

public class ReverseNumber 
{  
	public static void main(String[] args)   
	{  
/*	int number = 987654, reverse = 0;  
	while(number != 0)   
	{  
    int remainder = number % 10;  //4 //5 //6 //7 //8 //9
	reverse = reverse * 10 + remainder; //4 //45 //456 //4567 //45678 //456789
	number = number/10;  //98765 //9876 //987 //98 //9 //0
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	*/
	 int number=123456;
	 int reversedNumber = 0;
     
     for (int temp = number; temp != 0; temp=temp/10) 
     {
         int digit = temp % 10;
         
         reversedNumber = reversedNumber * 10 + digit;
     }
 	System.out.println("The reverse of the given number is: " + reversedNumber);  

	}
}
