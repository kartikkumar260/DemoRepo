package ListCollectionInJava;
/*
 The linked list is similar to Array list .The only difference is from internal architecture type prospective. 
  Rule
1) Linked list will help us to store group of object.
2) Base on requirement At Runtime Linked list may grow or shrink dynamically. 
3) Linked list will store data based on index  or Output is maintaining insertion order
4) It will allow duplicate data in array list.
5) Linked list implements list interface.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
		/*
		 Reference of list interface and object of Linked list interface
		 Scenario 1 => when array list without argument .Compile time error is displayed when we try to add different type of data.
       
		 */
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
	
	// get() method will get data from array list. eg get(index)
	System.out.println("Fetch data from 4th index of linkedlist==> "+linkedlist.get(4));
			
			
	// size() method will give size of array list or how many records we have in array list.
	System.out.println("Exact size of linkedlist==>  "+linkedlist.size());
			
	// Contains() method to find data that exist. If data exist then true is displayed otherwise false.
	System.out.println("If Exact data that exist in linkedlist===> "+linkedlist.contains("hello"));
		
	System.out.println("Initial all records of linkedlist ===>   "+linkedlist);
			
	//  add() method will help us to add value in arraylist.eg Add (index , value)  
			
	linkedlist.add(3,9);
	linkedlist.add(4,99);
			
	System.out.println("Final Linkedlist after adding few more record ==> "+linkedlist);
		
	System.out.println("Final linkedlist sized ==> "+linkedlist.size());
		
	// using remove() method for removing one record from linked list. eg 8.8 record on 9th index will be removed
	linkedlist.remove(9);
	System.out.println("Final linkedlist after removing a record from arraylist==> "+linkedlist);
		
		
	
	

	}

}
