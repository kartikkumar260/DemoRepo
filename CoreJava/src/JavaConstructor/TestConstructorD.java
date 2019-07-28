package JavaConstructor;

public class TestConstructorD extends ConstructorD{
	
	TestConstructorD() {
		
		super("OHM Namah Shiway"); // firstly parameterized  parent class string constructor is called then default constructor
			
			System.out.println("Default constructor  from Child class TestConstructorC");
		}
		
		TestConstructorD(int a) {
			this(); 
			// This() will by default call default constructor (TestConstructorD()) . 
			// Default constructor will behave accordingly.
			System.out.println("Parameterized integer constructor from Child class TestConstructorC");
		}

	public static void main(String[] args) {
		
		TestConstructorD ob = new TestConstructorD(9);

	}

}
