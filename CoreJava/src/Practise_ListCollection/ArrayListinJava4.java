package Practise_ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListinJava4 {

	public static void main(String[] args) {
		
		ArrayList A =new ArrayList();
		A.add(9);
		A.add(9.9);
		A.add(true);
		A.add("QA");
		A.add('H');
		
		System.out.println("A(arrarlist) size=>"+A.size());
		System.out.println("A(arraylist) record =>"+A);
		
		System.out.println("**For loop of Arraylist**");
		
		for (int i=0 ; i<A.size(); i++) {
			System.out.println(A.get(i));
		}
		
		System.out.println("***********For Each loop*****************");
		for (Object o : A) {
			System.out.println(o);
		}

		System.out.println("***************Using Iterator***************");
		Iterator itr =A.iterator();
		while (itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
