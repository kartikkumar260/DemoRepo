package Abstract;

/*
 * Rule => When a class extends abstract method then we have to define all unimplemented method
 */

public class TestAbstractClass extends AbstractClass {
	
	int a =12;
	int b =144;
	// below are method  defined in TestAbstractClass
	public void test1() {
		System.out.println("test1() non abstract Method that is defined in TestAbstractClass ");

	}
	public void test3() {
		System.out.println("test3() Method that is defined in TestAbstractClass ");

	}

	// we are implementing all unimplemented abstract method of Abstract Class
	@Override
	void test2() {
		System.out.println("We are implemntation for abstract method of Abstract class ");
		
	}

	public static void main(String[] args) {
		/*
	Rule = We cannot create reference and object of abstract class as compile time error is displayed
	AbstractClass ob = new AbstractClass();
		 */
		
	/*
	 Rule = We can create reference of abstract class and object of child class
	 
	 
	 we can acess all method and variable of abstract class
	 */
		System.out.println("************* Scenario of abstract class reference and child class object ************");
		AbstractClass ob = new TestAbstractClass();
		// Rule => Method call at compile time depend on reference. However method call at runtime depends on object (child class).
		// below case methods will be called from child class
		ob.test1();
		ob.test2();
		// Rule => Variable always depends upon reference . In below case variable values from parent class (abstract class) is always defined
		System.out.println(ob.a);
		System.out.println(ob.b);
		// Note => In case if we comment out variable a and b in parent class then as result runtime error occurs.
		
	// now creating object and reference of child class
		
		System.out.println("************* Scenario of  reference and  object of child class ************");
		TestAbstractClass ob1 = new TestAbstractClass();
		
		// Rule => Method call at compile time depend on reference. However method call at runtime depends on object.
		// below case methods will be called from child class
		ob1.test1();
		ob1.test2();
		ob1.test3();
		// Rule => Variable always depends upon reference . 
		//In below case variable values from child class (TestAbstractClass) is always defined
		System.out.println(ob1.a);
	    System.out.println(ob1.b);
	 // Note => In case if we comment out variable a and b in child class then as result variable value of parent class is picked.

	}
	




}
