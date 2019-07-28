package Practise_MethodOverriding;

public class TestExample1 extends Example1{

	
public void test2() {
	System.out.println("I am from child class having method as test2()");
}

public void test3() {
	System.out.println("I am from child class having method as tes3()");
}

public static void main(String[] args) {

	System.out.println("** reference and object of child class **");
	TestExample1 ob = new TestExample1();
	ob.test1();
	ob.test2();
	ob.test3();
	
	System.out.println("** reference and object of Parent class **");
	 Example1 ob1 =new  Example1();
	 ob1.test1();
	 ob1.test2();
	 
	 // obj1.test3(); cannot be called by parent class object as this method (test3()) is not defined in parent class.
	 
	System.out.println("** reference of parent class and object of Child class");
	Example1 obj2= new TestExample1();
	obj2.test1();
	obj2.test2();
	//obj2.test3();  method cannot be displayed for parent class reference . Since this method (test3()) does not exist in parent class.

	
}
}
