package JAVA;

public class MethodDemo8A
{
	void funA()
	{
		System.out.println("funA of MethodDemo8A");
		return;
		System.out.println("done");  //error bcz after return it terminates from the block
	}

	int funB()
	{
		System.out.println("funA of MethodDemo8A");
		return 10;
		System.out.println("done"); // error bcz after return it terminates from the block
	}

}
