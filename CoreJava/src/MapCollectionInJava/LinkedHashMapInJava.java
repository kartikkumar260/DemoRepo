package MapCollectionInJava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/*
 
=>	Linked Hash Map it maintain insertion order of data.
=>	Rest all is same as Hash Map collection.

 */
public class LinkedHashMapInJava {

	public static void main(String[] args) {
	
		Map<String , String> A = new LinkedHashMap<String ,String>();
		A.put("5", "Test5");
		A.put("4", "Test4");
		A.put("3", "Test3");
		A.put("2", "Test2");
		A.put("1", "Test1");
		A.put(null, "TestNull");
		/*
		 *  If we try to add record other than string then compile time error occurs. 
		 *  A.put(1 , 2) ;A.put('e' ,'r')  // compile time error occurs.
		 */

	    System.out.println("A linkedHash record are always displayed in insertion order===>   "+A);
	    System.out.println("Size of A linkedHashMap===>   "+A.size());
	    
		System.out.println("**************** Iterate :- Hashkey  of Linkedhashmap keys***************");
		Set<String> e = A.keySet();
		Iterator<String> itr = e.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("**************** Iterate :- values of Linkedhashmap keys***************");
		Set<String> e1 = A.keySet();
		Iterator<String> itr1 = e1.iterator();
		while(itr1.hasNext()) {
			System.out.println(A.get(itr1.next()));
		}
		
		System.out.println("*************Using entrySet() we can  fetch hashkey and value together***************");
		for(Map.Entry <String, String> e2 : A.entrySet()){
			System.out.println(e2.getKey()+"********"+e2.getValue());
		}
	}

}
