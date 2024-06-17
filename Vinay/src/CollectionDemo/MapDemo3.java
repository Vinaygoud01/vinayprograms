package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args)
	{
		Map<String,String> map1=new Hashtable<String,String>();
		map1.put("name","RBG");
		map1.put("JAVA","Selenium");
		map1.put("APi Testing","Rest Assured");
		String data1=map1.get("name");
		System.out.println(data1);
		
		map1.put("name","Technologies");
		map1.put("JAVA","Selenium");
		map1.put("APi Testing","Rest Assured");
		String data2=map1.get("name");
		System.out.println(data2);

		
	

	}

}
