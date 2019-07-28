package StaticandNonStatic;
/*
 Rule
 
 We need to create object of the class to access non static method and variable.
 We can directly call method and variable of static method by class name.

 */
public class Example {
	// non static variable
	int a =21;
	int b =24;
	
	// static variable
	static int c = 108;
	static int d =125;
	
	// non static method
	public void test1() {
		System.out.println("Non static method test1()");
	}
	
	public void test2() {
		System.out.println("Non static method test2()");
	}
	
	// static method
	public static void test3() {
		System.out.println(" static method test3()");
	}
    
	public static void test4() {
		System.out.println(" static method test4()");
	}
	public static void main(String[] args) {
		
		Example obj = new Example();
		// calling non static method and variable by object name
		obj.test1();
		obj.test2();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		// calling static method and variable directly by class name
		
		System.out.println("************Static method called by classname*************");
		
		// In below  static method and variable are called by class name
		Example.test3();
		Example.test4();
		System.out.println(Example.c);
		System.out.println(Example.d);
		
		
		System.out.println("**************** Static method called directly*******");
		// In below case static method and variable are called directly.
		test3();
		test4();
		System.out.println(c);
		System.out.println(d);
		

	}

}
