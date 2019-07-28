package Practise_Inheritance;
/*
Scenario :- In parent class we have defined variable (public , protected ,private ,default ,static and final ) and  no method.
However in Child class we defined variable (public , protected ,private ,default ,static and final ) and  no method.  
There is inheritance relationship between them.
*/
public class TestExample2 extends Example2 {
	
public int a = 7;
protected int b = 14;
//private member of parent class cannot be inherit into child class.
private int c = 21;
int d = 28;
static int e = 35;
final int f =42;

public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");

// Rule => Variable call always depends upon reference. 
// Rule => All variable defined in child class will override parent class variable. 

TestExample2 obj= new TestExample2();
System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(obj.f);

System.out.println("*****Scenario of reference and  object of parent class*****");

/*Rule => We cannot call private variable from parent class reference. 
          However, rest all variable are called from parent class. */


Example2 obj1= new Example2();
System.out.println(obj1.a);
System.out.println(obj1.b);
//System.out.println(obj1.c);  //private member of parent class cannot be inherit into child class.
System.out.println(obj1.d);
System.out.println(obj1.e);
System.out.println(obj1.f);


System.out.println("*****Scenario reference of parent class and  object of child class*****");

/*
 Rule =>  We cannot call private variable from parent class reference.
 Rule =>  Variable call always depends upon reference.Hence all variable are called from parent class.

 */

Example2 obj2 = new TestExample2();

System.out.println(obj2.a);
System.out.println(obj2.b);
//System.out.println(obj2.c);  //private member of parent class cannot be inherit into child class.
System.out.println(obj2.d);
System.out.println(obj2.e);
System.out.println(obj2.f);

}}