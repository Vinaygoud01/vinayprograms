package importantprograms;

public class Swapwithouttemp
{
  
	    public static void main(String args[]) {  
	        String a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  
    }  
//	    	int a,b;
//	    	a=10;b=20;
//	 
//	    a=a+b;
//	    b=a-b;   //using without 3rd variable
//	    a=a-b;
//	    System.out.println(a);
//	    System.out.println(b);

	    }

