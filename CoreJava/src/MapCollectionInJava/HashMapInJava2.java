package MapCollectionInJava;
/*
Reference of Hash Map and object of Hash Map class. 
Note => Although I am not making reference of map.But in java hashmap will internally implement MAP and it will acquire all property of MAP interface.

 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava2 {

	public static void main(String[] args) {
	HashMap<Integer , String> A = new HashMap<Integer , String>();
	A.put(50 ,"500");
	A.put(60 ,"600");
	A.put(70 ,"700");
	A.put(80 ,"800");
	A.put(90 ,"900");
	A.put(10 ,"1000");
	
	System.out.println(A);
	
	System.out.println("**************Scenario 1 for fetching key and value using entryset() method******************");
	
	Set<Entry<Integer, String>> e = A.entrySet();
	Iterator<Entry<Integer, String>> itr = e.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("**************Scenario 2 for fetching key using entryset() method******************");
	
	Set<Entry<Integer, String>> e1 = A.entrySet();
	Iterator<Entry<Integer, String>> itr1 = e1.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next().getKey());
	}
	System.out.println("**************Scenario 3 for fetching Value using entryset() method******************");
	Set<Entry<Integer, String>> e2 = A.entrySet();
	Iterator<Entry<Integer, String>> itr2 = e2.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next().getValue());
	}
	
	}

}
