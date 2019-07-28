package Practise_Constructor;



public class TestConstructorA extends ConstructorA{
	
	public TestConstructorA() {
	/* Super() ; this method  is provided  by default by Java
	* First Super statement will first call parent class default constructor . 
    * Secondly Then it will call child class default constructor. */	
		
	System.out.println("Default constructor from Child class TestConstructorA");
	}

	public TestConstructorA(int a) {
	/* Super() ; this method  is provided  by default by Java
	 * First Super statement will first call parent class default constructor . 
	 * Secondly Then it will call child class Parameterized constructor.*/
		
	System.out.println("Parameterized integer constructor from Child class TestConstructorA");
	}
	public static void main(String[] args) {
	System.out.println("***************firstly calling child class default constrctor*******");
	TestConstructorA ob= new TestConstructorA();
	System.out.println("***************Secondly calling child class Parameterized constructor*******");
	TestConstructorA ob1= new TestConstructorA(6);

	}

}
