package IteratorsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
  Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work
 */

public class ListIteratorInJava1 {

	public static void main(String[] args) {
		List A = new ArrayList<>();
		A.add(2);
		A.add(4);
		A.add(2.5);
		A.add(2.5);
		A.add('k');
		A.add("test");
		
		System.out.println("Entire records of A Arraylist==>  "+A);
		System.out.println("Size of A arraylist"+A.size());
		
		ListIterator itr = A.listIterator();
		/*
		 Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work.
		 */
		System.out.println("****** first use hasPrevious() and previous() method****************");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work.");
		
		System.out.println("******later use hasnext() and next() method***************");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
