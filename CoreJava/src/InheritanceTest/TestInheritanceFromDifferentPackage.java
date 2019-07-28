package InheritanceTest;


/* In case of inheritance relation with child class belonging to different package
 * 
  This scenario define below mentioned points 
 * 
 * a) ) If we create object and reference of child class. 
	 Result => We can only access public and protected ( method and variable) from child class belong to different package.
	 
   b) If we create object and reference of parent.
	 Result => We can only access public (method and variable) from parent class object.
     
     
   c) If we create object of parent class  and reference of child class.
	 Rule =>  We cannot call private method from parent class reference and object of child class.
	 Rule =>  Static method is strictly called from parent class. 
 */

import Inheritance.ParentClassB;

public class TestInheritanceFromDifferentPackage extends ParentClassB {

	public static void main(String[] args) {
		
		System.out.println("********using child class reference and child class object *************");
		
		// create object and reference of child class. 
		//We can only access public and protected ( method and variable) from child class belong to different package.
		TestInheritanceFromDifferentPackage ob = new TestInheritanceFromDifferentPackage();
		
		System.out.println(ob.a);
		System.out.println(ob.c);
		ob.test1();
		ob.test3();
		
		
		System.out.println("************ using parent class reference and parent class object*******");
		// Create object and reference of parent 
		// We can only access public (method and variable) from parent class object.
		ParentClassB ob1 = new ParentClassB();
		System.out.println(ob1.a);
		ob1.test1();
		
		System.out.println("*************using parent class reference and child class object*********");
		//If we create object of parent class  and reference of child class.
		// We can only access public (method and variable) from parent class object.
		ParentClassB ob2 = new TestInheritanceFromDifferentPackage();
		System.out.println(ob2.a);
		ob2.test1();
	

	}

}
