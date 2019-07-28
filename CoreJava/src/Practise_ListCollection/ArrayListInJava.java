package Practise_ListCollection;

import java.util.ArrayList;
import java.util.List;

/*
Rule
1) Array list will help us to store group of object.
2) Base on requirement At Runtime Array list may grow or shrink dynamically. 
3) Array list will store data based on index  or	Output is maintaining insertion order
4) It will allow duplicate data in array list.
5) We can add null values to arraylist
6) Array list implements list interface.
*/

public class ArrayListInJava {

	public static void main(String[] args) {
   /*
   Reference of list interface and object of Array list child class.
	*/

	List A =new ArrayList<>();
	A.add(5);
	A.add(5.5);
	A.add("5");
	A.add('5');
	A.add(true);
	
//  Rule => In case of duplicate entry it is allowed in array list.
	A.add(5);
	A.add(5.5);
	

	System.out.println("A array size ==>"+A.size());
	System.out.println("A array 4th index==> "+A.get(4));
	System.out.println("If hello exist in arraylist ==>"+A.contains("Hello"));
	System.out.println("A==>"+A);
	
	A.add(3,99);
	A.add(4,99.9);
	
	System.out.println("Final A array ==>"+A);
	
	List B = new ArrayList<>();
	B.add(5.5);
	B.add(25);
	B.add(625);
	B.add("test");
	System.out.println("B==>"+B);
	
	System.out.println("All record matching in A &B==>"+A.containsAll(B));
	
	A.addAll(B);
	System.out.println("A array after merging with B ==>"+A);
	
	A.remove(3);
	System.out.println("A array after removing ==>"+A);
	
	}}
