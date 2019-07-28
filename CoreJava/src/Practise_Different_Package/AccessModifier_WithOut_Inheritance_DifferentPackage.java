package Practise_Different_Package;

import Practise_AcessModifier.Example1;

public class AccessModifier_WithOut_Inheritance_DifferentPackage {

	public static void main(String[] args) {
	
		
		System.out.println("******** Using reference and object of Child class *********");
	//	Rule = In case if we don't have inheritance relationship  then we can only access public (method and variable).
		Example1 ob = new Example1();
		System.out.println(ob.a);
		ob.test1();
		

	}

}
