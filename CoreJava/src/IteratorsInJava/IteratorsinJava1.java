package IteratorsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsinJava1 {
	
	public static void main(String[] args) {
	List A = new ArrayList<>();
	A.add(2);
	A.add(4);
	A.add(2.5);
	A.add(2.5);
	A.add('k');
	A.add("test");
	
	System.out.println("Entire records of A Arraylist==>  "+A);
	
	Iterator itr = A.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		itr.remove();
	}
	System.out.println("After Removing records in  A Arraylist==>  "+A);

	}	
	

}


