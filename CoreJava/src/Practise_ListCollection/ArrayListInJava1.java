package Practise_ListCollection;

import java.util.ArrayList;
import java.util.List;

/*
 /*
 Scenario :- Now let make another Array list where we are going to fix type of data.
 Rule => collection we cannot work with data type or Primitive data type. eg We cannot supply argument as 'int' primitive data type.
 Rule =>  We can only work with object. Hence we have to specify class name . eg We will supply argument as'Integer'.
 */

public class ArrayListInJava1 {

	public static void main(String[] args) {

		/*
		 * Rule => If fix type of data is not specified than compile time error is
		 * displayed for entire Array list Rule => Since Data type is not specified so
		 * we can add any type of data to this array list.
		 */

		List A = new ArrayList<>();
		A.add(9);
		A.add(9.9);
		A.add("test");
		A.add('c');
		A.add(true);
		
		System.out.println("Array list(A) having no arguments==>"+A);

        // In below array list we can only add integer type data record. Since have supplied argument as 'Integer'.
		
		List<Integer> B = new ArrayList<Integer>();
		B.add(5);
		B.add(25);
		B.add(9);
		//B.add(5.5);compile time error occurs if we try to add record other than integer.
		//B.add(test);compile time error occurs if we try to add record other than integer.
		
		System.out.println("Array list(B) having Integer arguments===>"+B);
		
		
		// In below array list we can only add string type data.Since have supplied argument as 'String'.
		
		List<String> C = new ArrayList<String>();
		C.add("Ohm");
		C.add("Namah ");
		C.add("Shivaya");
		//C.add(25); compile time error occurs if we try to add record other than string.
		//C.add(true);compile time error occurs if we try to add record other than string.
		
		System.out.println("Array list(C) having String arguments===>"+C);
		
		// In below array list we can only add string type data.Since have supplied argument as 'Character'.
		
		List<Character> D = new ArrayList<Character>();
		D.add('O');
		D.add('H');
		D.add('M');
		D.add('c');
		//D.add(24); compile time error occurs if we try to add record other than character.
		//D.add("Ohm");compile time error occurs if we try to add record other than character.
		
		System.out.println("Array list(D) having String arguments===>"+D);
		
		A.removeAll(B);  // matching record 9 is not displayed
		System.out.println("Final Array list (A) ==>"+A);
		
		A.removeAll(D);  // matching record c is not displayed
		System.out.println("Final Array List (A) ==>"+A);
		
		
		
		

	}

}
