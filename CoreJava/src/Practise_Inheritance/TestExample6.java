package Practise_Inheritance;

/*
   Scenario :- In parent class we have defined no method and no variable.
   However in Child class there is  method (public , protected ,private ,default ,static and final) and variable(All).  
   There is inheritance relationship between them.
 */

public class TestExample6 extends Example6 {
	
	public int a = 5;
	protected int b = 10;
	// Rule =>private member of parent class cannot be inherit into child class.
	private int c = 15;
	int d = 20;
	static int e = 25;
	final int f =30;
	public void test1() {
		System.out.println("Child class TestExample5 having public method test1()");
		}

		protected void test2() {
		System.out.println("Child class TestExample5 having protected method test2()");
		}

		private void test3() {
		System.out.println("Child class TestExample5 having private method test3()");
		}

		void test4() {
		System.out.println("Child class TestExample5 having default method test4()");
		}

		public static void test5() {
		System.out.println("Child class TestExample5  having Static method test5()");
		}

		public final void test6() {
		System.out.println("Child class TestExample5  having Final method test6()");
		}
	
public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");

// Rule =private member of parent class cannot be inherit into child class.

TestExample6 obj= new TestExample6();
obj.test1();
obj.test2();
obj.test3();  
obj.test4();
obj.test5();
obj.test6();

System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c); 
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(obj.f);

System.out.println("*****Scenario of reference and  object of parent class*****");

// Rule => No method or variable can be called from parent class as Parent class is blank.

Example6 obj1= new Example6();

System.out.println("*****Scenario reference of parent class and  object of child class*****");

//Rule => No method or variable can be called from parent class as Parent class is blank.

Example6 obj2= new TestExample6();




}}
