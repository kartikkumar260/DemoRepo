package Practise_MethodOverloading;

/*
Question1 )  Is it possible overloading by Static method?
Yes, 

Question 2) Is it possible overloading by Final method?
Yes, 
 */
public class Example4 {
	
	
	public static void test() {
		System.out.println("static method test()");
	}

	public static void test(int a) {
		System.out.println("static method test(int a)");
	}
	
	public static void test(int a , int b) {
		System.out.println("static method test(int a , int b)");
	}
	public static void test(int a , int b , int c) {
		System.out.println("static method test(int a , int b , int c)");
	}
	public static final void test1() 
	{
	System.out.println("static final method test1()");
	}
	public static final void test1(int a) {
		System.out.println("static final method test1(int a)");
	}
	public static final void test1 (int a , int b) {
		System.out.println("static final method test1(int a, int b)");
	}
	public static final void test1 (int a , int b , int c) {
		System.out.println("static final method test1(int a , int b , int c)");
	}
	
	
	public static void main(String[] args) {

	System.out.println("*****Static method overloading*****");
	test();
	test(4);
	test(4,4);
	test(4,4,4); 
	System.out.println("*****Final method overloading*****");
	test1();
	test1(9);
	test1(9,9);
	test1(9,9,9); 

	}

}
