package Practise_Abstract;

import Abstract.TestAbstractClass;

public class Test_AbstractClass extends AbstractClass{

	int a =12;
	int b =144;
	
	public void test1() {
		System.out.println("test1() method belong to Test_AbstractClass");
	}
	public void test3() {
		System.out.println("test3() method belong to Test_AbstractClass");
	}
	public static void main(String[] args) {
/*Rule = We cannot create reference and object of abstract class as compile time error is displayed
		AbstractClass ob = new AbstractClass();   */
		
/*Rule = We can create reference of abstract class and object of child class. so that  We can access all method and variable of abstract class
		 */
	System.out.println("************* Scenario of abstract class reference and child class object ************");
	AbstractClass ob = new  Test_AbstractClass();
// Rule => Method call at compile time depend on reference. However method call at runtime depends on object (child class).
	ob.test1();
	ob.test2();
// Rule => Variable always depends upon reference . In below case variable values from parent class (abstract class) is always defined
    System.out.println(ob.a);
	System.out.println(ob.b);
	
	System.out.println("************* Scenario of  reference and  object of child class ************");
	Test_AbstractClass ob1 = new Test_AbstractClass();
// Rule => Method call at compile time depend on reference. However method call at runtime depends on object.
    ob1.test1();
    ob1.test2();
    ob1.test3();
// Rule => Variable always depends upon reference . Hence child class object reference is called.
    System.out.println(ob1.a);
    System.out.println(ob1.b);
	}
	@Override
	void test2() {
	System.out.println("We are writing  implementing of  abstact method that belong to Abstract class ");
	}

}
