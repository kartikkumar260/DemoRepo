package Practise_Constructor;

public class TestConstructorD extends ConstructorD{
	
public TestConstructorD() {
super("OHM NAMAH SHIWAY");
System.out.println("Default constructor of child class TestConstructorD");
}


public TestConstructorD(int a) {
this();
//This() will by default call default constructor (TestConstructorD()) . 
// Default constructor will behave accordingly.
System.out.println("Parameterized constructor of child class TestConstructorD");
}

public static void main(String[] args) {
System.out.println("******Execute Parameterized constructor ******");
TestConstructorD ob = new TestConstructorD(5);
	}

}
