package JavaConstructor;

/*
 * Default constructor has in build Super () calling statement.
 */

public class TestConstructorA extends ConstructorA {
	
	TestConstructorA() {
		
		/* Super() ; this method  is provided  by default by Java
		 * First Super statement will first call parent class default constructor . 
		 * Secondly Then it will call child class default constructor.
		 */
		
		System.out.println("Default constructor  from Child class TestConstructorA");
	}
	
	TestConstructorA(int a) {
		/* Super() ; this method  is provided  by default by Java
		 * First Super statement will first call parent class default constructor . 
		 * Secondly Then it will call child class parameterized constructor.
		 */
		System.out.println("Parameterized constructor from Child class ConstructorA");
	}

	public static void main(String[] args) {
		System.out.println("***************firstly calling child class default constrctor*******");
		TestConstructorA ob= new TestConstructorA();
		System.out.println("***************Secondly calling child class Parameterized constrctor*******");
		TestConstructorA ob1= new TestConstructorA(6);

	}

}
