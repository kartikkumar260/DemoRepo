package MapCollectionInJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInJava2 {
	
	public static void main(String[] args) {
		LinkedHashMap<Object,Object> A = new LinkedHashMap<Object,Object>();
		A.put("1", "Test1");
		A.put("2", "Test2");
		A.put("3", "Test3");
		A.put("4", "Test4");
		A.put(4 , "Integer 4");
		A.put(5.9, 5.9);
		A.put('C', 'k');
		
		 System.out.println("A linkedHash record are always displayed in insertion order===>   "+A);
		 System.out.println("Size of B linkedHashMap===>   "+A.size());
		 
		 
		 System.out.println("******************Scenario of fetching hash key and hash value****************");
		 /*
		  * Rule=> We need to create argument of Object type in both key and value. Below for loop will work fine.
		  * egLinkedHashMap<Object,Object> A = new LinkedHashMap<Object,Object>();
		  */
		 for(Map.Entry e : A.entrySet()){
			 System.out.println(e.getKey()+"********"+e.getValue());
		 }
	}
}
