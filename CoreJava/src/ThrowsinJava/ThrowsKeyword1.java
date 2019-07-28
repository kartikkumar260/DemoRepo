package ThrowsinJava;

import java.io.IOException;

public class ThrowsKeyword1 {
	
	public void test1() throws IOException {
		// we are making object of IOexception
		throw new IOException ("I am throwing IO exception ");
	}
	
	public  void test2() throws IOException {
		// Rule => Since we are calling test1() . So we have to declare IO exception in test2() method.
		test1();
		System.out.println("I am running from Test2 method");		
	}

	public static void main(String[] args) throws IOException {
		
		ThrowsKeyword1 ob= new ThrowsKeyword1();
		// even though we calling test2() method still we have to declare IOException
		ob.test2();
	

	}

}
