package InterfaceDemo;

public class UKBank implements Bank
{
	@Override
	public void totalBalance()
	{
		System.out.println("total balance of UK bank");
	}
	
	@Override
	public void totalBranches()
	{
		System.out.println("total brances of UK bank");
	}

}
