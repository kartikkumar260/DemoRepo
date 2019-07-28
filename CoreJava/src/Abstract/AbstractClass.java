package Abstract;
/*
=> A class that is declared with abstract keyword is known as abstract class in java.
=> It can have abstract and non-abstract methods (methods with body).
=> It can’t be instantiated. (the object can’t be created for abstract class).
=> A method that is declared as abstract and does not have implementation is known as abstract method.

 */

public abstract class AbstractClass {
	
/*
 Rule 1 => we cannot make a variable as abstract. Since a compile time error occurs. 
 
 abstract int b =25;
 
 */
	
	int a = 5;
	int b= 25;
	void test1() {
		System.out.println("I am non abstrat method of AbstractClass");
	}
/*
 Rule 2 =>  In case of abstract method we can not write method implementation. 
 If I try to write logic in body then compile time error occurs . 
 
 e.g abstract void test2() {
		// we are trying to write body in abstract method. Hence compile time error occurss.
	}

 */
	abstract void test2() ;  //  By default this method has "Default" access modifier.
	
	
	/*  Access modifier rules mentioned below
	 * 
	Rule 1 => But we can increase access of any member of parent class. Eg public from default is allowed.
	
	public abstract void test2() // it is completely allowed
	
	Rule 2 =>   We cannot decrease access of any member of parent class. Eg private from default is not allowed. 
	if we do so then compile time error is displayed.
	 
	private abstract void test2() // compile time error is displayed.
	 */

	
}
