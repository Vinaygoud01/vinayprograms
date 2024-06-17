package JAVA;

public class ICICIBank extends RBIBank   //RBIbank is parent class and ICICI bank is children class
{
	ICICIBank()
	{
		System.out.println("cons of icici");
	}
	

	public static void main(String[] args)
	{
		
		ICICIBank i1=new ICICIBank();
		i1.cBillscore();
	}
	public void cBillscore()
	{
		System.out.println("cbill score of RBI is 750");
	}

}
