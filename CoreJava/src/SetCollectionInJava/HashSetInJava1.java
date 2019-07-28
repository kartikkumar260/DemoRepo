package SetCollectionInJava;

import java.util.HashSet;
import java.util.Set;

/*
 * Scenario:- Adding of two same hash set <> using addAll() method
 * Scenario:- Adding of two different hash set <> using addAll() method
 */
public class HashSetInJava1 {
	

	private static final HashSet<Integer> Integer = null;

	public static void main(String[] args) {
	
		Set <Integer> A = new HashSet<Integer>();
        A.add(2);
		A.add(20);
		A.add(21);
		A.add(12);
		A.add(25);
		
		
		Set <Integer> B = new HashSet<Integer>();
        B.add(2);
		B.add(20);
		B.add(21);
		B.add(12);
		B.add(25);
		
		
		Set <Integer> C = new HashSet<Integer>();
        C.add(2);
		C.add(20);
		C.add(11);
		C.add(15);
		C.add(35);
		
		
        // Using addAll() method we can add two array list.
		System.out.println("**********************Scenario 1*********************************");
		 A.addAll(B);
	    System.out.println("Finally We are adding both hashset A&B==>  "+A);
	    System.out.println("Final size of A after adding A & B==>  "+A.size());
	    
	    
	    System.out.println("**********************Scenario 2*********************************");
	    A.addAll(C);
	    System.out.println("We are adding both hashset A and C ==>  "+A);
	    System.out.println("Final size of A after adding A & C==>  "+A.size());
	    
		

	}

}
