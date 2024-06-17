package importantprograms;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		
			//perfect number in java is, a positive integer that is equal to the sum of its proper divisors excluding itself.
			

				int num =6;
				int sum =0;   
				int i=1;    
				 while (num>i) 
				 {
			            if (num % i == 0) {
			            	sum = sum+i;  //1 //3 //6
			            }
			            i++;  //2 //3 //4 //5 //6
				 }
//				for(int i=1;i<num; i++)
//				{
//					if(num%i==0)
//					{
//						sum = sum+i;
//						System.out.println(i);
//					}
//				}

				System.out.println(num);
				System.out.println(sum);
		 
				if(sum==num)
				{
					System.out.println("Perfect");
				}
				else
				{
					System.out.println("NotPerfect");
				}
			}


}
