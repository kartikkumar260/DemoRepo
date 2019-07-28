package Practise_ListCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListinJava2 {
	/*
	 * Scenario =>  In case we will create reference of list and type (object) . We will supply argument as object.
	 */
	public static void main(String[] args) {
	
		//Scenario 1 => when array list without argument .Compile time error is displayed when we try to add different type of data.
		
		List A = new ArrayList<>();
		
		A.add(5);
		A.add(5.5);
		A.add("Ohm");
		A.add('O');
		A.add(true);
		A.add(9);
		A.add(9.9);
		
		System.out.println("A ==>"+A);
		
		/*
		Scenario 2 => In case of object  type argument we can store any type of data .
		eg integer , float ,short ,double etc. We will not get compile time error.
		 */
		
		List<Object> B = new ArrayList<Object>();
		B.add(false);
		B.add("Shiv Shakti");
		B.add('M');
		B.add(9);
		B.add(9.9);
		
		System.out.println("B ==>"+B);
		
		A.retainAll(B);// only matching record is displayed.
		System.out.println("Final A (Arraylist A) having all matching record of A&B===>"+A);
		
		/*
		 Scenario => how to remove all data from Array list 
		=> 	We can use clear () method to remove all data from Array list.
		 */
		
		List<Object> C = new ArrayList<Object>();
		C.add(false);
		C.add("Shiv Shakti");
		C.add('M');
		C.add(9);
		C.add(9.9);
		System.out.println("All record of ArrayList [C] ==>"+C);
		System.out.println("Validate if ArrayList [C]  is clear or not==>"+A.isEmpty());
		
		System.out.println("**Scenario of deleting all records from Array list [C]**");
		// Rule=> We can use clear () method to remove all data from linked list.
		C.clear(); 
		System.out.println("Validate if ArrayList [C]  is clear or not==>"+C.isEmpty());
		}}
