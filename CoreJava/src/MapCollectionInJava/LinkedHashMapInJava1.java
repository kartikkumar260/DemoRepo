package MapCollectionInJava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapInJava1 {

	public static void main(String[] args) {
	
	LinkedHashMap<Integer ,String> A = new LinkedHashMap<Integer , String>();
	A.put(50,"500");
	A.put(60,"600");
	A.put(70,"700");
	A.put(80,"800");
	A.put(90,"900");
	A.put(100,"1000");
	A.put(110,"1100");

	 System.out.println("A linkedHash record are always displayed in insertion order===>   "+A);
	 System.out.println("Size of B linkedHashMap===>   "+A.size());

	 System.out.println("**************Scenario 1 for fetching key and value using entryset() method******************");
	 Set<Entry<Integer, String>> e = A.entrySet();
	 Iterator<Entry<Integer, String>> itr = e.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 System.out.println("**************Scenario 2 for fetching key using entryset() method******************");
	 Set<Entry<Integer, String>> e1 = A.entrySet();
	 Iterator<Entry<Integer, String>> itr1 = e1.iterator();
	 while(itr1.hasNext())
	 {
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
