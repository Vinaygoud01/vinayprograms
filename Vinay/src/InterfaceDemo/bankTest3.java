package InterfaceDemo;

public class bankTest3 {

	public static void main(String[] args)
	{
		Bank b1=new USBank();
		b1.totalBalance();
		b1.totalBranches();
		
		b1=new USBank();
		b1.totalBalance();
		b1.totalBranches();
		
		b1=new CanadaBank();
		b1.totalBalance();
		b1.totalBranches();
		
		
	

	}

}
