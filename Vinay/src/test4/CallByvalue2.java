package test4;

public class CallByvalue2 
{
	int data=50;
	
//	void change(int data)
//	{
//		data=data+100;
//	}

	public static void main(String[] args) 
	{
		CallByvalue2 op=new CallByvalue2();
		
		System.out.println("before change"+op.data);
		op.change(500);
		System.out.println("Afetr the change" +op.data);
		

	}
	void change(int data)
	{
		data=data+100;
		System.out.println(data);
	}

}
