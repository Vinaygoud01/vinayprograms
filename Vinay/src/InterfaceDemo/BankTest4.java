package InterfaceDemo;

public class BankTest4 
{
	Bank b1;

	public static void main(String[] args)
	{
		BankTest4 b1=new BankTest4();
		b1.bankDetails("US");
	}
	void bankDetails(String bankName)
	{
		if(bankName.equals("US"))
		{
			b1=new USBank();
		}
		else if (bankName.equals("UK"))
		{
			b1=new UKBank();
		}
		else if(bankName.equals("canada"))
		{
			b1=new CanadaBank();
		}
		b1.totalBalance();
		b1.totalBranches();
	}
	

}
