 package ExceptionDemo;

public class VoterAgeValidation2
{


	public static void main(String[] args) 
	{
		VoterDetails(17);
	}
		public static void VoterDetails(int age)
		{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("voter age is not valid");
			new NullPointerException();
			throw new NullPointerException();  //by throw keyword we can raise an exception
			System.out.println("voter details continue.....");
		}
	}

}
