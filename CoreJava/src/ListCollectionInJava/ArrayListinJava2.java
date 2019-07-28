package ListCollectionInJava;

import java.util.ArrayList;
import java.util.List;

/*
 * Scenario =>  In case we will create reference of list and type (object) . We will supply argument as object.
 */
public class ArrayListinJava2 {

	public static void main(String[] args) {
		/*
		 Scenario 1 => when array list without argument .Compile time error is displayed when we try to add different type of data.
          */
			
		List A = new ArrayList<>();
		A.add(9);
		A.add(99);
		A.add(9.9);
		A.add(true);
		A.add('r');
		A.add("Test");
		A.add(9.9);
		
		System.out.println("All record of A arraylist===>  "+A);
		
		/*
		Scenario 2 => In case of object  type argument we can store any type of data .
		eg integer , float ,short ,double etc. We will not get compile time error.
		 */
		
		List<Object> B =new ArrayList<Object>();
		B.add(false);
		B.add('L');
		B.add("Welcome");
		B.add(9);
		B.add(9.9);
		B.add(99);
		
		System.out.println("All record of B arraylist====>   "+B);
		
		List<Object> C =new ArrayList<Object>();
		C.add(false);
		C.add('L');
		C.add("Welcome");
		C.add(9999);
		C.add(9.99);
		C.add(9999);
		
		
		System.out.println("All record of C arraylist====>   "+C);
		
		
		// using retainAll() method we can retain only matching data from one array list to another array list. 
		A.retainAll(B);
	    System.out.println("Final A (Arraylist A) having all matching record of A&B===>    "+A);
	    
	    
	    // Using retainAll() method we can retain only matching record .in below case there is no matching record.
	    A.retainAll(C);
	    System.out.println("There is no matchin record in A&C arrraylist====>   "+A);
	

	}

}
