package importantprograms;

public class PrimeNumbers100
{

	public static void main(String[] args)   
	{
		
	  int ct=0,TotalNumbers=0,i=1,j=1; 
	  
      while(TotalNumbers<100)  
	  {
	    j=1;  
	    ct=0;  
	     while(j<=i)  
	    {  
	      if(i%j==0)  
	      ct++;  
	      j++;   
	    }  
	   if(ct==2)  
	   {  
	      System.out.println(i+" ");  
	       TotalNumbers++;  
	   }  
	   i++;
	    
	  }    
	} 
	
	
}  


