package inheritance;

public class AxisBank2  extends RBIBank
{
	AxisBank2()
	{
		System.out.println("cons of AxisBank");
	}
	public static void main(String[] args)
	{
		AxisBank2 a1=new AxisBank2();
		a1.loanaccount();
		a1.CBILSCORE();
		
	}
	private void loanaccount() 
	{
		System.out.println("loan account of AxisBank");
		
		
	}
}
