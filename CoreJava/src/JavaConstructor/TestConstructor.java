package JavaConstructor;

/*
JVM by default create on default constructor if it is not create in class.
Whenever we create object of any class. Basically we are creating object of default constructor.

 */
public class TestConstructor {
	
	int a;
	int b;
	
	public TestConstructor() {
		System.out.println("I am from default constructor");
	}
	
	public  TestConstructor(int a) {
		System.out.println("I am from parametarized constructor");
	}

	public static void main(String[] args) {
	
		TestConstructor ob = new TestConstructor();
		TestConstructor ob1 = new TestConstructor(5);
	}

}
