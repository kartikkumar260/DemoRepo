package MapCollectionInJava;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapInJava4 {

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
		 
		 
		 System.out.println("**************** Iterate :- linkedHashkey  of Linkedhashmap keys***************");
		 Set<Object> e = A.keySet();
		 Iterator<Object> itr = e.iterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("**************** Iterate :- values of Linkedhashmap keys***************");
		 
		 Set<Object> e1 = A.keySet();
		 Iterator<Object> itr1 = e1.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(A.get(itr1.next()));
		 }
		 
		System.out.println("*************Using entrySet() we can  fetch hashkey and value together***************");
		// in below for loop we can skip Object twice.
		for(Map.Entry<Object ,Object>  e2 :A.entrySet()) {
			System.out.println(e2.getKey()+"***********"+e2.getValue());
			
		}

	}

}
