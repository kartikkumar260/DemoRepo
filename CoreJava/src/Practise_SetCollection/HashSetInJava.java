package Practise_SetCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetInJava {

	/*
	Rule=> Hash set will not maintain insertion order.
	Rule=> Hash set we can't store duplicate element.
	 */
	public static void main(String[] args) {
	
	System.out.println("**Scenario 1**");
	// we have created reference of set interface and object of hashset.
	Set hs= new HashSet <>();
	hs.add(5);
	hs.add(5);
	hs.add(5.5);
	hs.add(5.5);
	hs.add('k');
	hs.add('k');
	hs.add("ohm");
	hs.add("ohm");
	hs.add(true);
	hs.add(true);
	
	
	System.out.println("hashset without argument ==>"+hs);
	System.out.println("Size of hashset without argument ==>"+hs.size());
	
	System.out.println("**Scenario 2**");
	/*
	creating hash set with argument as object . Compile time error will disappear as argument is specified.
	In below hash set we can add any type of data record. Since have supplied argument as 'Object'.
	 */
	Set<Object> hs1= new HashSet <Object>();
	hs1.add(55);
	hs1.add(55);
	hs1.add(55.5);
	hs1.add(55.5);
	hs1.add("kk");
	hs1.add("kk");
	hs1.add("ohm");
	hs1.add("ohm");
	hs1.add(true);
	hs1.add(true);
	System.out.println("hashset having object as argument ==>"+hs1);
	System.out.println("Size of hashset having object as argument==>"+hs1.size());
	
	System.out.println("**Scenario 3**");
	/*
	creating hash set with argument as Integer . Compile time error will disappear as argument is specified.
	In below hash set we can only add data type of integer record. Since have supplied argument as 'Integer'.
	 */
	
	Set <Integer> hs2= new HashSet<>();
	hs2.add(555);
	hs2.add(888);
	hs2.add(666);
	hs2.add(777);
	hs2.add(555);
	hs2.add(888);
	hs2.add(666);
	hs2.add(777);
	//B.add(2.5);B.add('k');B.add("test') if we try to add any record having data type other than integer than compile time error occurs.
	System.out.println("hashset having Integer as argument ==>"+hs2);
	System.out.println("Size of hashset having Integer as argument==>"+hs2.size());
	
	System.out.println("**Scenario 4**");
	/*
	creating hash set with argument as String . Compile time error will disappear as argument is specified.
	In below hash set we can only add data type of String record. Since have supplied argument as 'String'.
	 */
	Set <String> C = new HashSet<String>();
	C.add("2");
	C.add("4");
	C.add("4.5");
	C.add("2");
	C.add("TEST");
	C.add("4.5");
	//C.add(2.5);C.add(5);C.add("test') if we try to add any record having data type other than string than compile time error occurs.
	
	System.out.println("Intial entire records of hashset having String as argument ==>   "+C);
	System.out.println("Exact size of hashset having String as argument==>  "+C.size());
	
	System.out.println("**Scenario 5**");
	/*
	creating hash set with argument as Character . Compile time error will disappear as argument is specified.
	In below hash set we can only add data type of String record. Since have supplied argument as 'Character'.
	 */
	Set <Character> D = new HashSet<Character>();
	D.add('a');
	D.add('b');
	D.add('2');
	D.add('5');
	D.add('2');
	D.add('5');
	//D.add(2.5);D.add(2);D.add("test') if we try to add any record having data type other than character than compile time error occurs.
	
	

	}

}
