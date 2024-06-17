package test;

import java.sql.SQLException;

public class HelloWorld
{
	
	    public static void main(String[] args)
	    {
	        callCenter();
	        unreach();
	    }
	    public static void  callCenter()
	    {
	       System.out.println("This is callCenter");
	    }
	  public static void unreach()
	  {
	    try
	    {
	    	//throw new SQLException();
	       
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	   
	    catch(ArithmeticException e)
	    {
	        e.printStackTrace();
	    }
	    
	   
	  

	}

}
