package errorprograms;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 
{

	public static void main(String[] args) 
	{
      List<String> list1 = new ArrayList<String>();
      list1.add("selenium");
      list1.add("java"); 
      
      int listsize = list1.size();
      System.out.println("listsize:"+listsize);
    	
      List<Integer> list2 = new ArrayList<Integer>();
      list2.add(10.43);
      list2.add(20.89);
      
      List<Boolean> list3 = new ArrayList<Boolean>();
      list3.add(true);
      list3.add(false);
      
	}

}
