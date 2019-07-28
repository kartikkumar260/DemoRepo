package InheritanceTest;
/*
 * We can access public (method and variable) from different class and package.
 *  Rule = In case if we don't have inheritance relationship  then we can only access public (method and variable).
 */

import AccessModifier.Example;

public class AccessModiferWithoutInheritFromDifferentPackage  {

	public static void main(String[] args) {
		Example ob = new Example();
		System.out.println(ob.a);
		ob.test1();

	}

}
