package Practise_Constructor;



/*
 * If we pass parameter in super calling method then first parameterized constructor of parent class is called first 
 * then default constructor of child class is called.
 */
public class TestConstructorB extends ConstructorB{
	
	
	public TestConstructorB() {
	super(5); // firstly parameterized parent class constructor is called then default constructor.
	
	System.out.println("Default constructor from child class TestConstructorB()");
	}
	
	public TestConstructorB(int a) {
	super();// Firstly default constructor of parent class is called then parameterized constructor
	System.out.println("Parameterized constructor from Child class TestConstructorB");
	}

	public static void main(String[] args) {
		System.out.println("***************firstly calling child class default constrctor*******");
		TestConstructorB ob= new TestConstructorB();
		System.out.println("***************Secondly calling child class Parameterized constrctor*******");
		TestConstructorB ob1= new TestConstructorB(6);


	}

}
