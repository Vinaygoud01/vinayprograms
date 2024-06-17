package JAVA;

public class GenericDemo2<G> {

	public static void main(String[] args)
	{
		GenericDemo2<String> g1=new GenericDemo2<String>();
		//g1.funA(10);
		//g1.funA(true);
		g1.funA("RBG technologies");
		
		//GenericDemo2<int> g2=new GenericDemo2<int>();
		GenericDemo2<Integer> g2=new GenericDemo2<Integer>();
		g2.funA(10);  //like Auto boxing and unboxing
		
		//GenericDemo2<boolean> g3=new GenericDemo2<boolean>();
		GenericDemo2<Boolean> g3=new GenericDemo2<Boolean>();
		g3.funA(true);
				

	}
	void funA(G g1)
	{
		System.out.println(g1);
	}

}
