package Practise_Constructor;


public class TestConstructorC extends ConstructorC{
	
public TestConstructorC () {
super("OHM NAHAH SHIWAY"); // firstly parameterized  parent class string constructor is called then default constructor
System.out.println("Default constructor  from Child class TestConstructorC");
}

public TestConstructorC (int a) {
super(); // Firstly default constructor of parent class is called then parameterized constructor
System.out.println("Parameterized integer constructor  from Child class TestConstructorC");
}

public TestConstructorC (String a) {
super(5);// Firstly parameterized integer  constructor of parent class is called then parameterized constructor
System.out.println("Parameterized String constructor  from Child class TestConstructorC");
}

public static void main(String[] args) {
System.out.println("********firstly calling child class default constrctor*******");
TestConstructorC ob= new TestConstructorC();
		
System.out.println("******Secondly calling child class parameterized integer constrctor*******");
TestConstructorC ob1= new TestConstructorC(6);

System.out.println("***************Thirdly calling child class parameterized string constructor");
TestConstructorC ob2= new TestConstructorC("OHM Namah Shiway");
	}

}
