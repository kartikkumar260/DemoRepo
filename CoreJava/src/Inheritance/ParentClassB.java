package Inheritance;
/*
 * Below scenario is related to ( private member of parent class cannot be inherit into child class.)
 
 
 
General Rules to Remember for Inheritance

1. Through Inheritance, child class will acquire all non static member of class.
2.	We cannot inherit private member of class.
3.	We can’t inherit static member of class. Since static member are class member.
4.	Final Member cannot be inherit.

 */

public class ParentClassB {
	
	public int a = 5;
	// private member of parent class cannot be inherit into child class.
	private int b = 15;
	protected int c = 25;
	int d = 35;
	static int e = 35;
	
	public void test1() {
		System.out.println(" ParentClassB having public method as test1()");
	}
	
	// private member of parent class cannot be inherit into child class.
	private void test2() {
		System.out.println(" ParentClassB having private method as test2()");
	}
	
	protected void test3() {
		System.out.println(" ParentClassB having protected method as test3()");
	}
	
	 void test4() {
		System.out.println(" ParentClassB having default method as test4()");
	}
	
	
	

}
