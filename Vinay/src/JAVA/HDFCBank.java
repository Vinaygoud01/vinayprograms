package JAVA;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("cons of HDFCBank");
	}

	public static void main(String[] args)
	{
		HDFCBank h1=new HDFCBank();
		h1.CBILSCORE();

	}
	public void CBILSCORE()
	{
		System.out.println("cbill score of rbi is 750");
	}

}
