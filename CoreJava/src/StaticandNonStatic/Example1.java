package StaticandNonStatic;

/*
 Rule
1.	We can only use static variable in static method.    
We can't use non static variable. Non static variable requires object for calling. 
Static method does not depend upon object. So we can't call non static variable.

2.	We can use both static and non static variable in Non-Static method.
Using object we can call both non static and static variable. 

 */
public class Example1 {

	int a ;
	static int b;
	
	public void test1() {
		System.out.println(a =21);
		System.out.println(b=51);
	}
	
	public static void test2() {
		System.out.println(b=15);
		
		// non static variable cannot be used in static method
		//System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("*******Static method & vairrable**************");
		test2();
		Example1.test2();
		System.out.println("Static variable under static method=="+Example1.b);
		System.out.println("Directly calling Static varible under satic method=="+b);
		
		System.out.println("*******Non Static method & variable***********");
		// we need to create class object to access non static method and variable
		Example1 obj= new Example1();
		obj.test1();
		System.out.println(" static and non static varible under non static method=="+obj.a);
		System.out.println(" static and non static varible under non static method=="+obj.b);
	}

}
