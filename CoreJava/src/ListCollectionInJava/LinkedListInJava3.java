package ListCollectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava3 {
	
	

	public static void main(String[] args) {

		// In below array list we can only add string type data.Since have supplied argument as 'String'.
		List <String >A = new LinkedList<String>();
		A.add("50");
		A.add("50");
		A.add("TEST");
		A.add("100");
		A.add("TRUE");
		A.add("55");
		A.add("100");
		//A.add(550); A.add(3.4) ; A.add('d') ; compile time error occurs since we are passing argument other than string
		
		System.out.println("Initial Entire data of A (linked list of string argument)==>   "+A);
		
		List B= new LinkedList<>();
		B.add("50000");
		B.add("100");
		B.add("50");
		System.out.println("Initial Entire data of B (linked list of string argument)==>   "+B);
		
		List C= new LinkedList<>();
		C.add("50000");
		C.add("1000");
		C.add("500");
		System.out.println("Initial Entire data of C (linked list of string argument)==>   "+C);
		
		// using retainAll() method we can retain only matching data from one array list to another array list.
		A.retainAll(B);
	    System.out.println("Final A (Arraylist A) having all matching record of A&B===>    "+A);
	    
	 // Using retainAll() method we can retain only matching record .in below case there is no matching record.
	    A.retainAll(C);
	    System.out.println("There is no matchin record in A&C arrraylist====>   "+A);

	}

}
