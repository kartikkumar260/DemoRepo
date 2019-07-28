package MethodOverloading;

/*
 Is it possible overloading by Static method?
Yes, 

 */

public class Example3 {
	
	public static void test1() {
		System.out.println("static method test1()");
	}
	
	public static void test1(int a) {
		System.out.println("static method overloading test1(int a)");
	}

	public static void main(String[] args) {
	
		Example3 ob = new Example3();
		ob.test1();
		ob.test1(5);

	}

}
