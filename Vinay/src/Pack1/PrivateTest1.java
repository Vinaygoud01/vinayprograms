package Pack1;

public class PrivateTest1 {

	public static void main(String[] args)
	{
		PrivateDemo1 p1=new PrivateDemo1();
		System.out.println(p1.a);  //because it is in private
		p1.funA();
		p1.funB();
	

	}

}
