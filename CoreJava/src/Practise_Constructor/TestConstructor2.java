package Practise_Constructor;
/*
 * this scenario covers various rules in constructor
 * 
 * A) No we cannot create two "Default constructor" .Since compile time error will occurs .
 * 
 * B) No we cannot create two "Parameterized constructor" with same argument .Since compile time error will occurs.
 * 
 * C) But we  can create two constructor having same argument but different data type.
 *    
 *    e.g. => Testconstructor(int a) and Testconstructor(String a)
 */


public class TestConstructor2 {
	

	TestConstructor2(int a){
		
		System.out.println("I am from parameterized integer constructor");
		
	}
	
	TestConstructor2(String a){
	
		System.out.println("I am from parameterized string constructor");
		
	}

	public static void main(String[] args) {
	System.out.println("**********First constructor ****************");
	TestConstructor2 ob1= new TestConstructor2(9);
	System.out.println("*********Second constructor ****************");
	TestConstructor2 ob3= new TestConstructor2("OHM");

	}
	/* Scenario 1
	 * A) No we cannot create two "Default constructor" .Since compile time error will occurs .
	 * 
	 * TestConstructor2() {
	 System.out.println("I am from default constructor");
	 * }
	 * 
	 *  TestConstructor2() {
	 * System.out.println("I am from default constructor");
	 * }
	 * 
	 */
	/* Scenario 2
	 * B) No we cannot create two "Parameterized constructor" with same argument .Since compile time error will occurs.
	 * 
	  TestConstructor2(int a) {
	 * this.a=a;
	 * }
	 * 
	 * TestConstructor2(int a) {
	 * this.a=a;
	 * }
	 * 
	 */
	
	/* Scenario 3
	 C) But we  can create two parameterized constructor having same argument but different data type.
     e.g. => Testconstructor(int a) and Testconstructor(String a)
	 */
	
}
