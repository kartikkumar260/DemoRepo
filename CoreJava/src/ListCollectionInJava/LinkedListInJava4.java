package ListCollectionInJava;

import java.util.LinkedList;
import java.util.List;

/*
Scenario => how to remove all data from Linked list 
=> 	We can use clear () method to remove all data from Linked list.

*/

public class LinkedListInJava4 {

	public static void main(String[] args) {
	List A = new LinkedList<>();
	A.add(11);
	A.add(11.11);
	A.add(false);
	A.add('K');
	A.add("Wrking");
	A.add(11.11);
	
	System.out.println("All records of A Linked list ==>     "+A);
	System.out.println("To validate if A Linked list is clear or not===>     "+A.isEmpty());
	
	System.out.println("***********************Scenario of deleting all records from above A  Array list *******************");
	//We can use clear () method to remove all data from linked list.
	A.clear();
	 System.out.println("Finally we have deleted all record from A (Linked list)==>  "+A);
	    System.out.println("To validate if A linked list is cleared finally==>   "+A.isEmpty());
	

	}

}
