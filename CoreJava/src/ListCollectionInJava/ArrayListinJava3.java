package ListCollectionInJava;

import java.util.ArrayList;
import java.util.List;

/*
 Scenario => how to remove all data from Array list 
=> 	We can use clear () method to remove all data from Array list.

 */

public class ArrayListinJava3 {

	public static void main(String[] args) {
	
		
		List A = new ArrayList<>();
		A.add(9);
		A.add(9.9);
		A.add(true);
		A.add('r');
		A.add("Test");
		A.add(9.9);

		System.out.println("All records of A arrray list ==>     "+A);
		System.out.println("To validate if A arraylist is clear or not===>     "+A.isEmpty());
		
		System.out.println("***********************Scenario of deleting all records from above A  Array list *******************");
		//We can use clear () method to remove all data from linked list.
	    A.clear();
	    System.out.println("Finally we have deleted all record from A (arraylist)==>  "+A);
	    System.out.println("To validate if A array list is cleared finally==>   "+A.isEmpty());
	}

}
