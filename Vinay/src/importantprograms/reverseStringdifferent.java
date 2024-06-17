package importantprograms;

public class reverseStringdifferent
{
	public static void main(String[] args) {
		
	
	String s = "0051023";
//	String rev="";
	
	char a[] = s.toCharArray();
	int size = a.length;
	System.out.println(size);
	
	for(int i = 0; i<=size-1; i++)
	{
	
		for(int j=0;j<=size-1;j++)
		{
			if(a[i]>=a[j])
			{
				System.out.print(a[j]);
				break;
				
			}
		}	
			
				
		//System.out.print(a[j]);
			
		}
		//rev = rev+a[i];
	}

}

