package ListCollectionInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava1 {
	
	public static void main(String[] args) {
	/*
	 * Rule => If fix type of data is not specified  than compile time error is displayed for entire Array list
	 * Rule => Since Data type is not specified so we can add any type of data to this array list.
	 */
		List A = new ArrayList<>(); 
		// argument of fix data type is not specified. Hence compile time error is displayed for this Array list.
		// We can add any type of record as data type is not specified.
		A.add(9);
		A.add(99);
		A.add(9.9);
		A.add(true);
		A.add('r');
		A.add("Test");
		A.add(9.9);
		
		System.out.println("Initial all record of  Array list(A) having no arguments===>   "+A);
		
		/*
		 Scenario :- Now let make another Array list where we are going to fix type of data.
		 Rule => collection we cannot work with data type or Primitive data type. eg We cannot supply argument as 'int' primitive data type.
		 Rule =>  We can only work with object. Hence we have to specify class name . eg We will supply argument as'Integer'.
		 */
		// In below array list we can only add integer type data record. Since have supplied argument as 'Integer'.
		
		List<Integer> B = new ArrayList<Integer>();
		B.add(5);
		B.add(25);
		B.add(625);
		B.add(390625);
		// we have 2 record 9 and 99 that are common in both arraylist.
		B.add(9);
		B.add(99);
		// B.add("Test"); compile time error occurs if we try to add record other than integer.
		
		
		System.out.println("Initial all record of  Array list(B) having Integer arguments===>   "+B);
		
		// In below array list we can only add string type data.Since have supplied argument as 'String'.
		
		List<String> c = new ArrayList<String>();
		c.add("OHM Namah Shiwaya");
		c.add("OHM Ambaya Namah");
		c.add("16");
		c.add("9");
		// c.add('c') , c.add(4) ,c.add(5,5); compile time error occurs if we try to add record other than string
		
		System.out.println("Initial all record of  Array list(C) having String arguments===>   "+c);
		
		// In below array list we can only add string type data.Since have supplied argument as 'Character'.
		List<Character> d = new ArrayList<Character>();
		d.add('O');
		d.add('H');
		d.add('M');
		d.add('9');
		// c.add("Test") , c.add(4) ,c.add(5,5); compile time error occurs if we try to add record other than character
		
		System.out.println("Initial all record of  Array list(D) having Character arguments===>   "+d);
		
		
	//  Using removeAll() method we can remove all matching data (A&B)  from array list (A).
   //   eg 9 ,99 matching records from Arraylists (A&B) are removed from Array list A.
		
		A.removeAll(B);
		System.out.println("Final A (array list) after removing matching data from arraylist (A&B)==>  "+A);
		
		
	//  Using removeAll() method we can remove all matching data (A&B)  from array list (A).
		   //   eg In below scenario there is no matching record.
				
		A.removeAll(c);
		System.out.println("Final A (array list) after removing matching data from arraylist (A&C)==>  "+A);
	}
}
