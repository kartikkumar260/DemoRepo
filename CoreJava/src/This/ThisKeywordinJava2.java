package This;
/*
  Rule 
  1) Using this() we can call non static member or This will be available for non static member..
  2) In Non static method using This() we can call static variable.
  3) But inside Static method we cannot use this() keyword as compile time error is displayed.
Reason => 
This is not available for static method  because this() refer current class object and current class instance. 
1)	All static method are class member. 
2)	But non static member are object member.so this() is used by non static member.
If we try to create this() in static method then compile time error occurs.

*/
public class ThisKeywordinJava2 {
	
	int a =10 ;
	static int  d =91;
	
	static void test1() {
	// this.    compile time error occur if we try to write "This keyword" inside static method.
	System.out.println("I am test1() method");	
	}
	
	void test2() {
	// calling static variable using this() keyword.	
	System.out.println(this.d);
	// calling all Non Static variable using this() keyword.
	System.out.println(this.a);
		System.out.println("I am test2() method");		
	}
	
	void test3() {
	this.test2();
	System.out.println("We are calling non static method using this() keyword");
	}

	public static void main(String[] args) {
		
		ThisKeywordinJava2 ob =new ThisKeywordinJava2();
		 System.out.println("**********Scenario 1 ** calling  static and non static variable through non static method***************");
		ob.test2();
	    System.out.println("**********Scenario 2 ** calling   'Non static' method using this through other non static method*****************");
	    ob.test3();
	    
	    System.out.println("**********Scenario 3 ******* calling 'Static method and variable' through class name*****************");
	    ThisKeywordinJava2.test1();
	    System.out.println(ThisKeywordinJava2.d);

	}

}
