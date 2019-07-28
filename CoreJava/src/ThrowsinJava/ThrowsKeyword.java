package ThrowsinJava;

import java.io.IOException;

public class ThrowsKeyword {
	
	
	public void test5() throws IOException {
		// we are making object of IOexception. or we are forcefully throwing IO exception.
		throw new IOException("I am from throws IO Exception");
	}

	public static void main(String[] args) throws IOException {
		
		ThrowsKeyword ob = new ThrowsKeyword();
		ob.test5();
	

	}

}
