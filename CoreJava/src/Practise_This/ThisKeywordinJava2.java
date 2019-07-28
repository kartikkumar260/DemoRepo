package Practise_This;
/*
=>	This is used to call current class constructor . Refer constructor example of "TestConstructorD"
=>	This can be used as method argument. This refer to current class
=>	Using this we can call non static member
=>	This will be available for non static member.
=>	In Non static method using This() we can call static variable.
=>  But inside Static method we cannot use this() keyword as compile time error is displayed.
 */

public class ThisKeywordinJava2 {

	int a =5;
	static int b=81;
	
	void test1() {
	// Rule => using this keyword calling non static method (test2()) and variable (a).  
	// Rule => This will be available for non static member.
	this.test2();
	System.out.println(this.a);
	// Rule => In Non static method using This() we can call static variable.
	System.out.println(this.b);
	System.out.println("I am from void test1() method");
	}
	
	void test2() {
	System.out.println("I am from void test2() method");
	}
	
	void test3(int a) {
	System.out.println("I am from void test3(int a) method");
	}
	
	void test4(ThisKeywordinJava2 ob) {
	System.out.println("I am from test4()method");
	System.out.println(ob.getClass().getName());
	// it will display "Package name" then class name .eg "Practise_This.ThisKeywordinJava1" .
	}
	
	void test5() {
	// Rule => We need to specify this keyword in argument to access test4(obj) method.
	test4(this);
	test3(4);
	}
	
	public static void test6() {
	// Rule => this. the compile time error occurs if we try to write 'this keyword' inside static method.
	System.out.println("I am test1() static method");
	}
	
	public static void main(String[] args) {
	ThisKeywordinJava2 ob=new ThisKeywordinJava2();
	System.out.println("***** Calling  static and non static variable and method through non static method***************");
	ob.test1();
	System.out.println("***** Calling 'Static method and variable' through class name*****************");
	ThisKeywordinJava2.test6();
	System.out.println(ThisKeywordinJava2.b);
	System.out.println("**************Scenario 1********");
	ob.test5();
	System.out.println("**************Scenario 2********");
	ob.test4(ob);

	
	
	}

}
