package MapCollectionInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapInJava4 {

	public static void main(String[] args) {
		/*
		 We have not specified argument value of Key and Value.Hence compile time error occurs.
		 We can add any type of data in key and value. eg integer , character , decimal , string.
		 */
		Map A = new HashMap<>();
		A.put("1", "Test1");
		A.put("2", "Test2");
		A.put("3", "Test3");
		A.put("4", "Test4");
		A.put(4 , "Integer 4");
		A.put(5.9, 5.9);
		A.put('C', 'k');
		
	    System.out.println("A hashmap record are not displayed in insertion order===>   "+A);
	    System.out.println("Size of A HashMap===>   "+A.size());
	    
	    Map B = new LinkedHashMap<>();
	    B.put("1", "Test1");
		B.put("2", "Test2");
		B.put("3", "Test3");
		B.put("4", "Test4");
		B.put(4 , "Integer 4");
		B.put(5.9, 5.9);
		B.put('C', 'k');
		
		 System.out.println("B linkedHash record are always displayed in insertion order===>   "+B);
		 System.out.println("Size of B linkedHashMap===>   "+B.size());

	}

}
