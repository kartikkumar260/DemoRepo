package MethodOverloading;
/*
Is it possible overloading by Final method?
Yes, 

*/
public class Example4 {
	
	public static final void test1 () {
		System.out.println("I am from static final method test1()");
	}
	
	public static final void test1(int a) {
		System.out.println("We are able to overload static final method test(int a)");
	}

	public static void main(String[] args) {
	
		Example4 a = new Example4();
		a.test1();
		a.test1(5);

	}

}
