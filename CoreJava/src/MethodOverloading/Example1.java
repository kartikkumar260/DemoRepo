package MethodOverloading;
/*
 * Method Overloading by changing "Type of argument".
 */
public class Example1 {
	
	
	public void test1() {
		System.out.println("test1()");
	}

	public void test1(int a) {
		System.out.println("test1(int a)");
	}
	
	public void test1(int a , int b) {
		System.out.println("test1(int a , int b)");
	}
	
	public void test1(double a) {
		System.out.println("test1(double a)");
	}
	
	public void test1(double a , double b) {
		System.out.println("test1(double a , double b)");
	}
	public static void main(String[] args) {

		Example1 ab = new Example1();
		ab.test1();
		ab.test1(9);
		ab.test1(9.9);
		ab.test1(7);
		ab.test1(7.7 ,8.7);
	}

}
