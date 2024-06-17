package inheritance;

public class CanaraBank extends RBIBank
{
	int minbalance=500;
	CanaraBank()
	{
		System.out.println("cons of CanaraBank");
		
	}
	public void CBILSCORE()
	{
		System.out.println("cbill score of rbi is 650");
		
	}
	public void croploan()
	{
		System.out.println("croploan of canarabank");
		
	}
	public static void main(String[] args)
	
	{
		
		//RBIBank r1=new CanaraBank();
		//r1.CBILSCORE();
		//r1.croploan();
		//System.out.println(r1.minbalance);
		CanaraBank r1=new CanaraBank();
		r1.CBILSCORE();
		r1.croploan();
		System.out.println(r1.minbalance);
	
				
		
	}
}
