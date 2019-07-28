package SetCollectionInJava;

import java.util.HashSet;
import java.util.Set;

/*
Scenario => We are creating reference and object of Hash set . It will work fine for this code.

=>	Though we don’t write reference of interface set and object of Hash set . Still required code will work.
=>	Internally hash set will implement set interface.
=>	Though explicitly we are writing or not internally it is implementing set interface.
*/
public class HashSetInJava5 {

	public static void main(String[] args) {
		HashSet <Integer> A = new HashSet<Integer>();
        A.add(2);
		A.add(20);
		A.add(21);
		A.add(12);
		A.add(25);
		
		System.out.println("Initial Entire records of  Hashset A ===>   "+A);
		System.out.println("Size  of  Hashset A ===>   "+A.size());
		//using remove() method for removing one record from hash set . eg true record on 2th index will be removed
	    A.remove(2) ;
	 	
	 	System.out.println("After removing record from Final Hash set  ==>" +A);
	 	System.out.println("Size  of  Hashset A after removing  ===>   "+A.size());

	}

}
