package inheritance;

public class AxisBank
{
	AxisBank()
	{
		System.out.println("cons of AxisBank ");
	}

	public static void main(String[] args) 
	{
		RBIBank r1=new RBIBank();
		r1.CBILSCORE();
		AxisBank a1=new AxisBank();
		a1.loanAccount();
}
	void loanAccount()
	{
		System.out.println("loan Account of AxisBank");
	}

}
