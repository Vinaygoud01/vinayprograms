package InterfaceDemo;

public class USBank implements Bank
{
	@Override
	public void totalBalance()
	{
		System.out.println("total balance of us bank");
	}
	
	@Override
	public void totalBranches()
	{
		System.out.println("total brances of us bank");
	}

}
