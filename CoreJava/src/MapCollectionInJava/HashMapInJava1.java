package MapCollectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Rule => 	It may have only one NULL key and multiple NULL values.
 */

public class HashMapInJava1 {

	public static void main(String[] args) {
	Map<Integer , String> A = new HashMap<Integer , String>();
	
	A.put(6, null);
	A.put(5, null);
	A.put(4, "Test4");
	A.put(3, "Test3");
	A.put(2, "Test2");
	A.put(1, "Test1");
	A.put(null, "Null Test");
	
	System.out.println("Entire record in Hashmap ==>  "+A);
	System.out.println("Size of Hashmap==>  "+A.size());
	
	
	System.out.println("**************** Iterate :- Hashkey  of hashmap keys***************");
	
	Set <Integer> keyset=A.keySet();
	Iterator<Integer> itr =keyset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("**************** Iterate :- values of hashmap keys***************");
	
	Set<Integer> keyset1=A.keySet();
	Iterator<Integer> itr1=keyset1.iterator();
	while(itr1.hasNext()) {
		System.out.println(A.get(itr1.next()));
	}

   System.out.println("*************Using entrySet() we can  fetch hashkey and value together***************");
   for( Map.Entry<Integer, String> e : A.entrySet()) {
	   
	   System.out.println(e.getKey()+"*******"+e.getValue());

	}

}
}
