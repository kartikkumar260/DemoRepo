package MethodOverloading;

/*
 * Example of method overloading by changing "Number of argument". 
 */
public class Example {

	
	public void test1() {
	System.out.println("test1()");	
	}
	
	public void test1(int a) {
	System.out.println("test1(int a)");	
	}
	
	public void test1(int a , int b) {
	System.out.println("test1(int a , int b)");	
	}
	
	public void test1(int a , int b , int c) {
	System.out.println("test1(int a , int b, int c)");	
	}
	
	public void test1(int a , int b , int c ,int d) {
	System.out.println("test1(int a , int b, int c ,int d)");	
	}
	
	
	
	public static void main(String[] args) {

		Example ab= new Example();
		ab.test1();
		ab.test1(4);
		ab.test1(4,4);
		ab.test1(4,4,4);
		ab.test1(4,4,4,4);
		

	}

}
