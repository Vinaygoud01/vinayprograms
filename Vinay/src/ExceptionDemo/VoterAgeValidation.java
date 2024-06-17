package ExceptionDemo;

public class VoterAgeValidation {

	public static void main(String[] args)
	{
		VoterDetails(19);
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
		}
		System.out.println("voter details continue....");
	}

}
