package SetCollectionInJava;
/*
=>	This will maintain data in insertion order.
=> 	Rest all method of hashset is same as linked hash set.

 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {

	public static void main(String[] args) {

	HashSet<Integer> A = new HashSet<Integer>() ;
	A.add(21);
	A.add(2);
	A.add(9);
	A.add(221);
	A.add(244);
	System.out.println("Insertion order is not maintained in case of HasHset ==>  "+A);
	
	LinkedHashSet<Integer> B = new LinkedHashSet<Integer>();
	B.add(21);
	B.add(2);
	B.add(9);
	B.add(221);
	B.add(244);
	System.out.println("Insertion order is n maintained in case of LinkedHashset==>  "+B);
	
	/*
	Scenario => In below example output remain same in cases of set interface and hashset interface.
	 */
	
	Set <Integer> C = new LinkedHashSet<Integer>();
	C.add(21);
	C.add(2);
	C.add(9);
	C.add(221);
	C.add(244);
	System.out.println("Output remin same in case of set interface and hashset class==>  "+C);
	

	}

}
