package SetCollectionInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetInJava3 {

	public static void main(String[] args) {
		Set <Integer> A = new HashSet<Integer>();
        A.add(2);
		A.add(20);
		A.add(21);
		A.add(12);
		A.add(25);
		
	
		System.out.println("Initial Entire records of  Hashset A ===>   "+A);
		
		Set <Integer> B = new HashSet<Integer>();
        B.add(2);
		B.add(20);
		B.add(11);
		B.add(15);
		B.add(35);
	
	
					
		System.out.println("Initial Entire records of  Hashset B ===>   "+B);
		
		
		Set <Object> C =new HashSet<Object>();
		C.add(false);
		C.add('L');
		C.add("Welcome");
		C.add(9999);
		C.add(9.99);
		C.add(9999);
		
	;
		
		
		// using retainAll() method we can retain only matching data from one hash set  to another hash set.. 
		A.retainAll(B);
	    System.out.println("Final A (Hash set) having all matching record of A & B===>    "+A);
			    
			    
		// Using retainAll() method we can retain only matching record .in below case there is no matching record.
		 A.retainAll(C);
	     System.out.println("There is no matchin record in A&C hash set ====>   "+A);
				
		

	}

}
