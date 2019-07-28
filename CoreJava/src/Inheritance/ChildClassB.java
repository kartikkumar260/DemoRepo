package Inheritance;
/*
 * Below scenario is related to ( private member of parent class cannot be inherit into child class.)
 
 */
public class ChildClassB extends ParentClassB {

	public static void main(String[] args) {
		
		ChildClassB ob = new ChildClassB();
		
		System.out.println(ob.a);
		System.out.println(ob.c);
		System.out.println(ob.d);
		ob.test1();
		ob.test3();
		ob.test4();
		
	}

}
