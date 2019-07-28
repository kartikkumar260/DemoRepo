package Practise_Different_Package;

import Practise_Inheritance.Example3;

public class TestInheritance_DifferentPackage extends Example3 {

	
public static void main(String[] args) {
		
System.out.println("*****Scenario of reference and object of child class*****");

TestInheritance_DifferentPackage obj = new TestInheritance_DifferentPackage();
obj.test1();
obj.test2();
obj.test5();
obj.test6();

System.out.println(obj.a);
System.out.println(obj.b);


System.out.println("*****Scenario of reference and  object of parent class*****");

Example3 obj1 = new Example3();
obj1.test1();
obj1.test5();
obj1.test6();

System.out.println(obj1.a);

System.out.println("*****Scenario reference of parent class and  object of child class*****");

Example3 obj2 = new TestInheritance_DifferentPackage();
obj2.test1();
obj2.test5();
obj2.test6();

System.out.println(obj2.a);



	}
}
