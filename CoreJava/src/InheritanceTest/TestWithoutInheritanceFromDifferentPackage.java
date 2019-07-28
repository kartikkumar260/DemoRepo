package InheritanceTest;

/* In case we call a class belonging to different package having no inheritance relationship.
 * 
 Rule
 We can access public (method and variable) from different class and package having no inheritance relationship.
 
  This scenario define below mentioned points 
  
 * a)  If we create object and reference of parent.
	 Result => We can only access public (method and variable) from parent class object.
 */

import Inheritance.ParentClassB;

public class TestWithoutInheritanceFromDifferentPackage {

	public static void main(String[] args) {
	
		ParentClassB ob = new ParentClassB();
		ob.test1();
		System.out.println(ob.a);

	}

}
