package SetCollectionInJava;

import java.util.HashSet;
import java.util.Set;

/*
 * Scenario :  RemoveAll() method . this method will remove all matching data from 2 hashset.
 */

public class HashSetInJava2 {
	

	public static void main(String[] args) {
		Set <Integer> A = new HashSet<Integer>();
        A.add(2);
		A.add(20);
		A.add(21);
		A.add(12);
		A.add(25);
		
		// Contains() method to find data that exist. If data exist then true is displayed otherwise false.
		System.out.println("If Exact data that exist in hashset A===> "+A.contains("hello"));
			
		System.out.println("Initial Entire records of  Hshset A ===>   "+A);
		
		Set <Integer> C = new HashSet<Integer>();
        C.add(2);
		C.add(20);
		C.add(11);
		C.add(15);
		C.add(35);
	
		System.out.println("If Exact data that exist in hashset A===> "+C.contains(15));
					
		System.out.println("Initial Entire records of  Hshset A ===>   "+C);
		
		
		// ContainsAll() method we can check if all data matches in both hashset (A and C) . If yes true otherwise false
		System.out.println("Are all record matching in both Hashset A & C====> "+A.containsAll(C));
		
		
		/*
		 *Using removeAll() method we can remove all matching data (A&C)  from Hash set (A).
		 *eg 2,20  matching records from Hashset (A&C) are removed from Hash set A.
		 */ 
		
		A.removeAll(C);
		System.out.println("Final A hashset  after removing matching data from arraylist (A&C)==>  "+A);
		System.out.println("Size of A hashset  after removing matching data from arraylist (A&C)==>  "+A.size());
				
		

	}

}
