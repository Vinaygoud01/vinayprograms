package JAVA;

public class Odemo8c {

	public static void main(String[] args) {
	
		A a1=new A();
		System.out.println(a1);  //same address
		System.out.println(a1);
		System.out.println(a1);
		
		System.out.println(new A());  //different Address because every time  call new object is created
		System.out.println(new A());
		System.out.println(new A());
		

	}

}
