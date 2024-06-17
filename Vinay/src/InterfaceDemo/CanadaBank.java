package InterfaceDemo;

public class CanadaBank implements Bank
{
	@Override
	public void totalBalance()
	{
		System.out.println("total balance of canada bank");
	}
	
	@Override
	public void totalBranches()
	{
		System.out.println("total brances of canada bank");
	}


}
