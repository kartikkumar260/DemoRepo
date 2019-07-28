package JavaConstructor;

public class TestConstructor1 {
	
	// global variable
	int a ,b,c ;
	
	
	public TestConstructor1() {
		System.out.println("I am from default constructor");
	}
	
	
	public  TestConstructor1(int a) // local variable
	{
	 this.a =a;
	 System.out.println("I am from parametarized constructor :- int a"+a);
	}
	
	void display() {
		System.out.println("value of a :- "+a);
	}
	
	void display1 () {
		System.out.println("value of a and b ==> "+a+"," +b);
	}
	
	public  TestConstructor1(int a , int b) // local variable
	{
	 this.a =a;
	 this.b=b;
	 System.out.println("I am from parametarized constructor :- int a and int b ");
	}
	
	void sum() {
		int d= a+b;
		System.out.println("sum of 2 integer==> "+d);
	}

	public  TestConstructor1(int a , int b ,int c) // local variable
	{
	 this.a =a;
	 this.b=b;
	 this.c=c;
	 System.out.println("I am from parametarized constructor :- int a , int b and int c ");
	}
	
	void sum1() {
		int d =a+b+c;
		System.out.println("sum of 3 integer==>"+d);
	}
	

	public static void main(String[] args) {
		System.out.println("************First constructor***********");
		TestConstructor1 ob= new TestConstructor1();
		// value of default constructor is not initialized
		ob.display();

		System.out.println("************second constructor***********");
		
		
		
		TestConstructor1 ob1= new TestConstructor1(5);
		// value is initialized for parameterized constructor. hence 5 will be displayed 
		ob1.display();
		ob1.display1();
		
		System.out.println("************thrid constructor***********");
		TestConstructor1 ob2= new TestConstructor1(9,9);
		// value is initialized for parameterized constructor. hence 9 ,9 will be displayed 
		ob2.display();
		ob2.display1();
		ob2.sum();
		
		System.out.println("*****Four constructor******");
		TestConstructor1 ob3 = new TestConstructor1(11 ,11 ,11);
		ob3.display();
		ob3.display1();
		ob3.sum();
		ob3.sum1();
	    
	}
}
