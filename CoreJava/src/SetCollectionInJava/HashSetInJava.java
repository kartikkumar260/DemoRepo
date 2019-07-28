package SetCollectionInJava;

import java.util.HashSet;
import java.util.Set;

/*
 Rule 
 
=> Hash set  we can’t store duplicate element.
=> Hash set will not maintain insertion order. 

 */

public class HashSetInJava {
	

	public static void main(String[] args) {
/*
  Rule => If fix type of data is not specified  than compile time error is displayed for entire Hash set
  Rule => Since Data type is not specified so we can add any type of data to this array list.
 */
	// we have created reference of set interface and object of HashSet class.
	Set hashset = new HashSet<>();
	hashset.add(2);
	hashset.add(2);
	hashset.add(3);
	hashset.add(3);
	hashset.add(9.8);
	hashset.add(9.8);
	hashset.add('k');
	hashset.add('k');
	hashset.add("Gratefull");
	hashset.add("Gratefull");
	hashset.add(true);
	hashset.add(true);
	
	System.out.println("*************Scenario 1********************");
	
	System.out.println("Intial entire records of hashset without argument ==>   "+hashset);
	System.out.println("Exact size of hashset==>  "+hashset.size());
	/*
	 * Output = HashSet we cannot store duplicate data and Insertion order is not maintained.
	 */
	System.out.println("*************Scenario 2********************");
	/*
	creating hash set with argument as object . Compile time error will disappear as argument is specified.
	In below hash set we can add any type of data record. Since have supplied argument as 'Object'.
	 */
	
	Set<Object> A = new HashSet<Object>();
	A.add(2);
	A.add(2);
	A.add(3);
	A.add(4.5);
	A.add('k');
	A.add("Test");
	A.add("Test");
	
	
	System.out.println("Intial entire records of hashset having object as argument ==>   "+A);
	System.out.println("Exact size of hashset having object as argument==>  "+A.size());
	
	System.out.println("*************Scenario 3********************");
	/*
	creating hash set with argument as Integer . Compile time error will disappear as argument is specified.
	In below hash set we can only add data type of integer record. Since have supplied argument as 'Integer'.
	 */
	Set <Integer> B = new HashSet<Integer>();
	B.add(2);
	B.add(2);
	B.add(3);
	B.add(4);
	B.add(5);
	B.add(4);
	//B.add(2.5);B.add('k');B.add("test') if we try to add any record having data type other than integer than compile time error occurs.
	
	System.out.println("Intial entire records of hashset having integer as argument ==>   "+B);
	System.out.println("Exact size of hashset having integer as argument==>  "+B.size());

	System.out.println("*************Scenario 4********************");
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
	
	System.out.println("*************Scenario 5********************");
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
	
	System.out.println("Intial entire records of hashset having character as argument ==>   "+D);
	System.out.println("Exact size of hashset having character as argument==>  "+D.size());
	}

}
