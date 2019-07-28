package ListCollectionInJava;
/*
 Rule
1) Array list will help us to store group of object.
2) Base on requirement At Runtime Array list may grow or shrink dynamically. 
3) Array list will store data based on index  or	Output is maintaining insertion order
4) It will allow duplicate data in array list.
5) We can add null values to arraylist
6) Array list implements list interface.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {

	public static void main(String[] args) {
	/*
	 Reference of list interface and object of Array list child class.
	 */
		List Arraylist = new ArrayList<>();
		Arraylist.add(5);
		Arraylist.add(5.5);
		Arraylist.add(true);
		Arraylist.add('c');
		Arraylist.add("Test");
       //  Rule => In case of duplicate entry it is allowed in array list.
		Arraylist.add(5.5);
		Arraylist.add(true);
		Arraylist.add(null);
		
		// get() method will get data from array list. eg get(index)
		System.out.println("Fetch data from 4th index of Arraylist==> "+Arraylist.get(4));
		
		
		// size() method will give size of array list or how many records we have in array list.
		System.out.println("Exact size of Arraylist==>  "+Arraylist.size());
		
		// Contains() method to find data that exist. If data exist then true is displayed otherwise false.
		System.out.println("If Exact data that exist in arraylist===> "+Arraylist.contains("hello"));
	
		System.out.println("Initial Entire records of  Arraylist ===>   "+Arraylist);
		
		//  add() method will help us to add value in arraylist.eg Add (index , value)  
		
		Arraylist.add(3,9);
		Arraylist.add(4,99);
		
		System.out.println("Final Entire records after adding few more record ==> "+Arraylist);
		
		/*
		 Rule => We canot create duplicate reference of any object in data as this will cause compile time error.
		 List Arraylist = new ArrayList<>(); // compile time error occurss
		 */
		
		
		List Arraylist1 = new ArrayList<>();
		Arraylist1.add(5.5);
		Arraylist1.add(25);
		Arraylist1.add(625);
		Arraylist1.add(390625);
		System.out.println("Initial Entire records of  Second arraylist (Arraylist1)  ====>   "+Arraylist1);
		
		// ContainsAll() method we can check if all data matches in both Arraylists (Arraylist and Arraylist1) . If yes true otherwise false
		System.out.println("Are all record matching in both Arraylist====> "+Arraylist.containsAll(Arraylist1));
		
		
		// Using addAll() method we can add two array list.
		
	    Arraylist.addAll(Arraylist1);
	    System.out.println("Finally We are adding both arraylist"+Arraylist);
	    
	    
	 // using remove() method for removing one record from arraylist. eg null record on 9th index will be removed
	 	Arraylist.remove(9) ;
	 	
	 	System.out.println("After removing record from Final array list ==>" +Arraylist);
		
		
	
		

	}

}
