package inheritance;

public class ObjectclassArrayDemo1 {

	public static void main(String[] args)
	{
		Object o1[]=new Object[6];  //by using this we can group the diff. data types in Array
		o1[0]=new Object();
		o1[1]=new RBIBank();
		o1[2]=new HDFCBank();
		o1[3]="RBG Technologies";
		o1[4]=10;
		o1[5]=true;
		System.out.println(o1[3]);
		
	

	}

}
