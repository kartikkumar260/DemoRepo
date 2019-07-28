package Practise_Constructor;
/*
Question) In below script if we comment (remove) default constructor then what happen ?

Answer => If we forcefully write parameterized constructor to the class then JVM will not keep by default constructor to class.
When you are making object on default constructor. Hence compile time error occurs. 
Note => Default constructor is not written.  */

public class TestConstructor3 {
	
	/*
	 TestConstructor3() {
	  System.out.println("I am from default constructor");
	}
	 */
	TestConstructor3(int a) {
		System.out.println("I am parameterized integer constructor");
	}
	public static void main(String[] args) {
	// we have not written default constructor . But we are trying to call it then compile time error occurs
	//	TestConstructor3 ob = new TestConstructor3();
	// If we remove parameterized integer constructor then above line will work as jvm will keep default constructor 

	}

}
