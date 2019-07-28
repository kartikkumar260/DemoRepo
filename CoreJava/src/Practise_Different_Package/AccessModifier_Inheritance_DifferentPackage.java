package Practise_Different_Package;

import Practise_AcessModifier.Example1;

public class AccessModifier_Inheritance_DifferentPackage extends Example1 {

	public static void main(String[] args) {
		
	System.out.println("******** Using reference and object of Child class *********");
	AccessModifier_Inheritance_DifferentPackage ob = new AccessModifier_Inheritance_DifferentPackage();
	/*Rule = In this scenario can only access only public and protected (method and variable) from different class 
	 and package having inheritance relationship.
	*/

	System.out.println(ob.a);
	System.out.println(ob.b);
	ob.test1();
	ob.test2();
	
	System.out.println("******* Using reference and object of Parent class *********");
	// Rule => We can access public (method and variable) from different class and package.
	Example1 ob1 = new Example1();
	System.out.println(ob1.a);
	ob1.test1();
	
	System.out.println("************* Using  Parent class reference and object of child class *********");
	// Rule => We can access public (method and variable) from different class and package.
	Example1 ob2 = new AccessModifier_Inheritance_DifferentPackage();
	System.out.println(ob2.a);
	ob2.test1();

	}

}
