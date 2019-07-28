package MethodOverriding;

public class TestExample extends Example{
	
	public void test2() {
		System.out.println("I am from child class having method test2()");
	}

	public void test3() {
		System.out.println("I am from child class having method test3()");
	}
	public static void main(String[] args) {
	
		// using child class reference and child class object 
		
		System.out.println("**using child class reference and child class object **");
		TestExample ob = new TestExample();
		ob.test1();
		ob.test2();
		ob.test3();
		
		System.out.println("********************");
		
		// using parent class reference and child class object
		
		System.out.println("** using parent class reference and child class object**");
		
		Example ob1 = new TestExample();
		ob1.test1();
		ob1.test2();
		// test3() method cannot be displayed for parent class reference . Since this method (test3()) does not exist in parent class.

		System.out.println("********************");
		// using parent class reference and parent class object 
		
		System.out.println("**using parent class reference and object**");
		
		Example ob2 =new Example();
		ob2.test1();
		ob2.test2();
		//ob1.test3() cannot be called by parent class object as this method (test3()) is not defined in parent class.
	}

}
