package JAVA;

public class budzDemo1 {

	public static void main(String[] args) 
	{
		int grossSalary=10000;
		int netSalary=grossSalary-totalcharges; //error bcz totalcharges is an local variable i.e used inside that method only 
		System.out.println(netSalary);

	}
	void houseCharges()
	{
		int rent=1000;
		int childfee=2000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
	}

}
