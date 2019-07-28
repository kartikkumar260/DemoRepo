package Practise_MethodOverloading;
/*
 * Method Overloading by changing "Type of argument".
 */
public class Example2 {
	
	void test1() {
		System.out.println("test1()");
	}
	
	void test1(int a) {
		System.out.println("test1(int a)");
	}

	void test1(int a , int b) {
	System.out.println("test1(int a , int b)");
	}
	
	void test1(double a) {
		System.out.println("test1(double a)");
	}
	
	void test1(double a , double b) {
		System.out.println("test1(double a , doubleb)");
	}
	public static void main(String[] args) {
	
		Example2 ob = new Example2();
		ob.test1();
		ob.test1(4);
		ob.test1(9,9);
		ob.test1(5.1);
		ob.test1(7.5 , 8.9);

	}

}
