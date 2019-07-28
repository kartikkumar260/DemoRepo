package ListCollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava5 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList<>();
		A.add(9);
		A.add(9.9);
		A.add(true);
		A.add('r');
		A.add("Test");
		A.add(9.9);
		
		System.out.println("All records of A arraylist===>"+A);
		System.out.println("Exact size of A (array list)==>  "+A.size());
		/*
		 Rule => Array list works on indexes . Hence we can iterate records using for loop
		 */
		System.out.println("*************For loop for Arraylist***************");
		for (int i=0 ; i< A.size(); i++) {
       
			System.out.println(A.get(i));
	}
		System.out.println("***********For Each loop*****************");
	for(Object a  : A ) {
		System.out.println(a);
	}
	
	System.out.println("***************Using Iterator***************");
    Iterator itr = A.iterator();
    while (itr.hasNext()) {
    	System.out.println(itr.next());
    }

}
}