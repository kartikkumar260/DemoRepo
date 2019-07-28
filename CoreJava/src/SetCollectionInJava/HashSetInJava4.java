package SetCollectionInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetInJava4 {
	
	/*
	 * Scenario =>  In case we will create reference of list and type (object) . We will supply argument as object.
	 */

	public static void main(String[] args) {
		Set <Integer> A = new HashSet<Integer>();
        A.add(2);
		A.add(20);
		A.add(21);
		A.add(12);
		A.add(25);
		
		System.out.println("***********************Scenario 1 of inital record *******************");
		System.out.println("Initial Entire records of  Hashset A ===>   "+A);
        System.out.println("To validate if A Hash set  is clear or not===>     "+A.isEmpty());
		
		System.out.println("***********************Scenario of deleting all records from above A  Hash set *******************");
		//We can use clear () method to remove all data from hash set .
	    A.clear();
	    System.out.println("Finally we have deleted all record from A (Hash set)==>  "+A);
	    System.out.println("To validate if A Hash set  is cleared finally==>   "+A.isEmpty());
	}

	

}
