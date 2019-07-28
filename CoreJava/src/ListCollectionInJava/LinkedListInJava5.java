package ListCollectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Scenario => We are creating reference and object of Linked list . It will work fine for this code.

=>	Though we don’t write reference of interface list and object of Linked list list. Still required code will work.
=>	Internally Linked list will implement list interface.
=>	Though explicitly we are writing or not internally it is implementing list interface.

*/
public class LinkedListInJava5 {

	public static void main(String[] args) {
		
	//  We are creating reference and object of Linked list . It will work fine for this code.
		
			LinkedList A = new LinkedList<>();
			A.add(9);
			A.add(9.9);
			A.add(true);
			A.add('r');
			A.add("Test");
			A.add(9.9);
			
			System.out.println("All records of A Linked list===>"+A);
			
			/*
			 Below observe all methods are working fine for reference and object of array list.
			 */
			
			// get() method will get data from array list. eg get(index)
			System.out.println("Fetch data from 4th index of A (linked list)==> "+A.get(4));
					
					
		    // size() method will give size of array list or how many records we have in array list.
			System.out.println("Exact size of A (linked list)==>  "+A.size());
					
		   // Contains() method to find data that exist. If data exist then true is displayed otherwise false.
			System.out.println("If Exact data that exist in A(linked list)===> "+A.contains("hello"));
			System.out.println("Initial Entire record data of A linked list ==>  "+A);
					
		   //  add() method will help us to add value in linked list.eg Add (index , value)  
					
			A.add(3,77);
			A.add(4,7777);
					
			System.out.println("Finall A(linked list) after adding few more record ==> "+A);
					
					
			//using remove() method for removing one record from linked list. eg true record on 2th index will be removed
			A.remove(2) ;
				 	
			System.out.println("After removing record from Final linked list ==>" +A);
					
					



	}

}
