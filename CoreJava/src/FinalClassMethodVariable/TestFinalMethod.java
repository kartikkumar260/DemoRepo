package FinalClassMethodVariable;

import MethodOverriding.Example1;
import MethodOverriding.TestExample1;

/*
 * This scenario define below mentioned points 
 * 
 * a)  final method if defined in parent class that we can not write required code for child class as compile time error occurs.
 * 
 * b) If we create object and reference of child class. 
	 Result => We can override all method that are defined in parent class with child class
	 
   c) If we create object and reference of parent.
	 Result => We cannot call private method from parent class reference and object.
     Result =>  Rest all method are called from parent class.
     
     
   d) If we create object of parent class  and reference of child class.
	 Rule =>  We cannot call private method from parent class reference and object of child class.
	 Rule =>  Static method is strictly called from parent class. 
 */


public class TestFinalMethod extends FinalMethod	 {

	/*
	 * Rule => In child class we cannot write final method  that is already defined in Parent class. If we do so than compile time error occurs.
	 *
	 public final void test5() {
     System.out.println("Child class TestFinalMethod having Final method test5()");
	  } 
	 * 
	 */
	
	 // public method
	public void test1() {
		System.out.println("Child class TestExample1 having override  public method test1()");
	}

	// private method
	private void test2() {
		System.out.println("Child class TestExample1 having override  private method test2()");
	}
    
	// protected method
	protected void test3() {
		System.out.println("Child class TestExample1 having protected method test2()");
	}
	// static method
	public static void test4 () {
		System.out.println("Child class TestExample1 having override  static  method test4()");
	}
	
	public static void main(String[] args) {

		// create object and reference of child class. 
		//We can override all method that are defined in parent class with child class.
		System.out.println(" ***********Scenario of reference and object of child class ***********");
		TestFinalMethod ob = new TestFinalMethod();
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		ob.test5();
		
		
		System.out.println(" ***********Scenario of reference and  object of parent class ***********");
		// Create object and reference of parent 
		// We cannot call private method from parent class reference and object.
		// Rest all method are called from parent class
		FinalMethod	 ob1 = new FinalMethod();
		ob1.test1();
		ob1.test3();
		ob1.test4();
		ob1.test5();
		
		
		System.out.println(" ***********Scenario of parent class object and  reference of child class ***********");
		// Create object of parent class  and reference of child class 
		// We cannot call private method from parent class reference and object of child class
		// Static method is strictly called from parent class 
		FinalMethod ob2 = new TestFinalMethod();
		ob2.test1();
		ob2.test3();
		ob2.test4();
		ob2.test5();
		
	}

	}


