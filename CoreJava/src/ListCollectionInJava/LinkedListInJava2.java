package ListCollectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava2 {


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
		
		 // Using removeAll() method we can remove all matching data (A&B)  from array list (A).
		   //   eg 50 , 100 matching records from Arraylists (A&B) are removed from Array list A.
		A.removeAll(B);
		System.out.println("Final A (Linked list) after removing matching data from linked list (A&B)==>  "+A);
		
		

	}

}
