package ListCollectionInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava1 {

	public static void main(String[] args) {
		
		List linkedlist = new LinkedList<>();
		linkedlist.add(8);
		linkedlist.add(16);
		linkedlist.add(8.0);
		linkedlist.add(true);
		linkedlist.add('k');
		linkedlist.add("All is Well");
	    //  Rule => In case of duplicate entry it is allowed in linked list.
		linkedlist.add(16);  
		linkedlist.add(8.0);  
		
		System.out.println("Initial Entire data of linkedlist==>   "+linkedlist);

		
		/*
		 Scenario :- Now let make another Array list where we are going to fix type of data.
		 Rule => collection we cannot work with data type or Primitive data type. eg We cannot supply argument as 'int' primitive data type.
		 Rule =>  We can only work with object. Hence we have to specify class name . eg We will supply argument as'Integer'.
		 */
		// In below array list we can only add integer type data record. Since have supplied argument as 'Integer'.
		
		List<Integer> A = new LinkedList<Integer>();
		A.add(7);
		A.add(14);
		A.add(16);
		A.add(8);
		A.add(71);
		A.add(72);
		// A.add(7.8 ); A.add('k') ; A.add("test"); compile time error occurs if we try to add decimal , character and string type data.
		System.out.println("Initial Entire records of A (linkedlist)==>   "+A);
		
		// ContainsAll() method we can check if all data matches in both link lists (linklist and A) . If yes true otherwise false
	    System.out.println("Are all matching records of both linked list  ====> "+linkedlist.containsAll(A));
	    
	// Using addAll() method we can add two array list.
		
	    linkedlist.addAll(A);
	    System.out.println("Finally We are adding both Linked list"+linkedlist);
				
}
}
