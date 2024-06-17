package errorprograms;

import java.util.HashMap;

public class MapDemo3 {

	public static void main(String[] args) 
	{
     HashMap<String, String> map1 = new HashMap<String ,String>(int);
     map1.put("selenium", "java");                    //,
     map1.put("Api testing", "post man");
     map1.put("CICD tool", "jenkines");
     
     int mapsize = map1.size(1);
     System.out.println("mapsize :"+mapsize);
     
     map1.put("selenium", "java");
     map1.put("Api testing", "post man");
     map1.put("CICD tool", "jenkines");
     map1.put("version control", "git");
    		
     
     int mapsize2 = map1.size(0);
     System.out.println("mapsize2 :"+mapsize2);
     
     
	}

}
