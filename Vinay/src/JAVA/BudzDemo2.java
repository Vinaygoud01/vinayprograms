package JAVA;

public class BudzDemo2 {

	public static void main(String[] args) 
	{
		int grossSalary=10000;
		BudzDemo2 bd1=new BudzDemo2();
		int netSalary=grossSalary-bd1.housecharges();
		System.out.println(netSalary);
		
	}
	int housecharges()   //int housecharges()=totalcharges;
	{
		int rent=1000;
		int childfee=2000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
	}

}
