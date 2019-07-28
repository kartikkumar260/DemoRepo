package Practise_MethodOverloading;
/*
 Example of method overloading by changing "Number of argument". 
 */

public class Example1 {
	
	public void test1() {
		System.out.println("test1()");
	}
	
	public void test1(int  a) {
		System.out.println("test1(int  a)");
	}

	public void test1(int  a , int b ) {
	System.out.println("test1(int  a , int b)");
	}

	public void test1(int  a , int b , int c) {
		System.out.println("test1(int  a , int b , int c)");
	}
	
	public void test1(int  a , int b , int c ,int d) {
		System.out.println("test1(int  a , int b , int c ,int d)");
	}
	public static void main(String[] args) {
		Example1 ob = new Example1();
		ob.test1();
		ob.test1(2);
		ob.test1(4 ,4);
		ob.test1(5,5,5);
		ob.test1(9,9,9,9);
		ob.test1();

	}

}
