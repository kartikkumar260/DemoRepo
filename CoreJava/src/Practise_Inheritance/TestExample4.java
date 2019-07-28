package Practise_Inheritance;

/*
   Scenario :- In parent class we have defined method (public , protected ,private ,default ,static and final ) and no variable.
   However in Child class there is no method and variable(public , protected ,private ,default ,static and final).  
   There is inheritance relationship between them.
 */

public class TestExample4 extends Example4 {
	
	
	public int a = 5;
	protected int b = 10;
	// Rule =>private member of parent class cannot be inherit into child class.
	private int c = 15;
	int d = 20;
	static int e = 25;
	final int f =30;	
	
public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");

// Rule =private member of parent class cannot be inherit into child class.

TestExample4 obj= new TestExample4();
obj.test1();
obj.test2();
//obj.test3();  //private member of parent class cannot be inherit into child class.
obj.test4();
obj.test5();
obj.test6();

System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c); // Since private variable is defined in child class. Hence we can access it.
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(obj.f);

System.out.println("*****Scenario of reference and  object of parent class*****");

// Rule => We cannot call private method from parent class reference and object. eg test 3() 

Example4 obj1= new Example4();
obj1.test1();
obj1.test2();
// obj1.test3();  private member of parent class cannot be inherit into child class.
obj1.test4();
obj1.test5();
obj1.test6();

/*
There are no variable defined in parent class hence these can not be called 
System.out.println(obj1.a);
System.out.println(obj1.b);
System.out.println(obj1.c); 
System.out.println(obj1.d);
System.out.println(obj1.e);
System.out.println(obj1.f);

*/
System.out.println("*****Scenario reference of parent class and  object of child class*****");

//Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
//        b) Static method is strictly called from parent class. However public ,Protected and default methods are called from child class.


Example4 obj2= new TestExample4();
obj2.test1();
obj2.test2();
// obj2.test3();   private member of parent class cannot be inherit into child class.
obj2.test4();
obj2.test5();   // Static method is Strictly called from parent class
obj2.test6();
/*
There are no variable defined in parent class hence these can not be called 
System.out.println(obj2.a);
System.out.println(obj2.b);
System.out.println(obj2.c);  // Since private variable is defined in child class. Hence we can access it.
System.out.println(obj2.d);
System.out.println(obj2.e);
System.out.println(obj2.f);
*/
}}
