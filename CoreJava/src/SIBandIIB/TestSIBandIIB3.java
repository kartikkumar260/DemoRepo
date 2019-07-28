package SIBandIIB;

/*
Static block can only take static variable. 

IIB block can take both static and non static variable.

 */
public class TestSIBandIIB3 {
	
	static int a ;
	int b;
	
	
	static {
		 a=10;
		// int  b = 20  non static variable cannot be used in SIIB .Compile time error is displayed
		
		System.out.println("I am from SIB block 1");
		System.out.println(a);
	}

	{
		a=20;
		b=55;
		
		System.out.println("I am from instance initialization block");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
	
		System.out.println("SIB block is executed automatically once class get loaded");
		
		TestSIBandIIB3 obj = new TestSIBandIIB3();
		
		
		
	
	}

}
