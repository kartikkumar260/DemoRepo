package MapCollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
	
	/*
	 Important point about Hashmap
=>	A Hashmap contains value based on key .It implements map interface.
=>	It contains only unique elements.
=>	It may have only one NULL key and multiple NULL values.
=>	It will not maintain insertion order.
     */

	public static void main(String[] args) {
		// Key is in form of integer and value is in form string.
		Map<Integer, String> hashmap = new HashMap<Integer , String>();
		
		/*
		 * Rule 1 => Hashkey values(1 ,2) are not overridden once declared. So this hashkey are not overridden with new one.
		 * Rule 2 => Values once declared (Test 1 and Test 2)  are always overridden with new values (Test 3 and Test 4).
		 */
		
		
		 hashmap.put(1, "Test1");
		 hashmap.put(2, "Test2");
	    /*
	     * Hash Key ( 1 and 2 ) declared in above two records remains constant . Since these value are not overridden with new hask key value defined in below 2 record. 
	       Value (Test 1 and Test 2) are successfully overridden with new values of (Test 3 and Test 4)
	     */
		 hashmap.put(1, "Test3");
		 hashmap.put(2, "Test4");
		 
		 System.out.println("Entire records in Hashmap ==>  "+hashmap);
		 
		 System.out.println("Value fetch from second index in Hashmap==>  "+hashmap.get(2));
		 System.out.println("Size of Hashmap==>  "+hashmap.size());

	}

}
