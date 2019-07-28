package Practise_ListCollection;

import java.util.ArrayList;

/*
Scenario => We are creating reference and object of Arraylist . It will work fine for this code.

=>	Though we don’t write reference of interface list and object of Array list list. Still required code will work.
=>	Internally Array list will implement list interface.
=>	Though explicitly we are writing or not internally it is implementing list interface.

*/

public class ArrayListinJava3 {

	public static void main(String[] args) {
	
		
	ArrayList A =new ArrayList();
	A.add(9);
	A.add(9.9);
	A.add(true);
	A.add("QA");
	A.add('H');
	
	
	System.out.println("A arraylist size=>"+A.size());
	System.out.println("4th index of arraylist=>"+A.get(2));
	System.out.println("If hi data exist on A arraylist=>"+A.contains("hi"));
	System.out.println("A==>"+A);
	A.add(3,"OHM");
	A.add(4 ,"Test");
	System.out.println("Final A arraylist after adding record=>"+A);
	
	A.remove(2);
	System.out.println("Final A arraylist after removing"+A);
	

	}

}
