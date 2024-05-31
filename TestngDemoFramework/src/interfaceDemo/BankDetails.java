package interfaceDemo;

public class BankDetails implements SavingAccount,CreditCards,LoanAccount
{
	public static void main(String[] args)
	{
		SavingAccount sa=new BankDetails();
		
		
	}
	
	@Override
	public void newLoan()
	{
		
	}
	@Override
	public void newCard()
	{
		
	}

	@Override
	public void newAccount() {
		// TODO Auto-generated method stub
		
	}
}
