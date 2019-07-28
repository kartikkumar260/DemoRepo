package InheritanceTest;
/*
Scenario = In case of inheritance we can only call public and protected method from child class belong to different package.
Rule 1 => We can access public and protect (method and variable) from different class and package.
Rule 2 =>	We cannot access private and default from different class and package.
*/

import AccessModifier.Example;

public class AccessModiferInheritFromDifferentPackage extends Example{

	public static void main(String[] args) {
		
		
		System.out.println("******** Using reference and object of Child class *********");
		/*Rule = In this scenario can only access only public and protected (method and variable) from different class and package having inheritance relationship.
		*/

		AccessModiferInheritFromDifferentPackage ob = new AccessModiferInheritFromDifferentPackage();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.test1();
		ob.test2();
		
		
		System.out.println("******* Using reference and object of Parent class *********");
		
		// Rule => We can access public (method and variable) from different class and package.
		 
		Example ob1 = new Example();
		System.out.println(ob1.a);
		ob1.test1();
		
		
	
		System.out.println("************* Using  Parent class reference and object of child class *********");
		// Rule => We can access public (method and variable) from different class and package.
		Example ob2 = new AccessModiferInheritFromDifferentPackage();
		System.out.println(ob2.a);
		ob2.test1();
		

	}

}
