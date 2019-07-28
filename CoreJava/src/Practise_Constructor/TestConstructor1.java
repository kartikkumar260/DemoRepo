package Practise_Constructor;

public class TestConstructor1 {
	
	// global variable
	int a ,b, c;
	
	public TestConstructor1() {
		System.out.println("I am default constructor");
	}

	public TestConstructor1(int a) {
		this.a=a;
		System.out.println("I am parameterized constructor :- int a ="+a);
	}
	
	public TestConstructor1(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println("I am parameterized constructor :-int a and int b");
	}
	
	public TestConstructor1(int a , int b , int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("I am parameterized constructor :- int a, intb and int c");
	}
	
	void display() {
		System.out.println("Value of a=="+a);
	}
	
	void display1() {
	    System.out.println("Value of a and b=="+a+ ";"+b);
	}
	
	void display2() {
		System.out.println("Value of a ,b and c=="+a+";"+b+";"+c);
	}
	
	void sum() {
	int d= a+b;
	System.out.println("Sum of a and b=="+d);
	}
	
	void sum1() {
	int f=a+b+c;
	System.out.println("Sum of a,b and c=="+f);
	}
	public static void main(String[] args) {
	System.out.println("*****First constructor**********");
	// Rule =value of default constructor is not initialized.Hence 0(zero) will be displayed.
	TestConstructor1 ob = new TestConstructor1();
	ob.display();
    ob.display1();
    ob.display2();
    ob.sum();
    ob.sum1();
 
	System.out.println("****Second constructor*********");
	TestConstructor1 ob1 = new TestConstructor1(5);
	// Rule= value is initialized for parameterized constructor. hence 5 will be displayed.
	ob1.display();
	ob1.display1();
	ob1.display2();
	ob1.sum();
    ob1.sum1();
    
    System.out.println("****third constructor*********");
	TestConstructor1 ob2 = new TestConstructor1(7,7);
	// Rule= value is initialized for parameterized constructor. hence 7 ,7 will be displayed.
	ob2.display();
	ob2.display1();
	ob2.display2();
	ob2.sum();
    ob2.sum1();
    
    System.out.println("****four constructor*********");
 	TestConstructor1 ob3 = new TestConstructor1(9,9,9);
    // Rule= value is initialized for parameterized constructor. hence 9 ,9,9 will be displayed.
 	ob3.display();
 	ob3.display1();
 	ob3.display2();
 	ob3.sum();
    ob3.sum1();


	}

}
