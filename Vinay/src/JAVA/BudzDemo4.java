package JAVA;

public class BudzDemo4 {

	public static void main(String[] args)
	{
		int grossSalary=10000;
		BudzDemo4 bd1=new BudzDemo4();
		int charges=bd1.housecharges();  //charge is a variable we are assigning a variable to it
		
		int netSalary=grossSalary-charges;
		System.out.println(netSalary);
		int taxcal=30*charges;
		System.out.println(taxcal);
		

	}
	int housecharges()
	{
		System.out.println("housecharges is invoking");
		int rent=1000;
		int childfee=2000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
		
	

	}

}
