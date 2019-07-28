package Practise_Inheritance;
/*
   Scenario :- In parent class we have defined variable (public , protected ,private ,default ,static and final ) 
   and Method (same as method).
    However in Child class there is no method and variable.  
   There is inheritance relationship between them.
 */
public class TestExample3 extends Example3 {
	
public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");

// Rule =>All method defined in parent class will be executed. Except private member (method, variable)

TestExample3 obj= new TestExample3();
obj.test1();
obj.test2();
//obj.test3();// private member of parent class cannot be inherit into child class.
obj.test4();
obj.test5();
obj.test6();

System.out.println(obj.a);
System.out.println(obj.b);
//System.out.println(obj.c); private member of parent class cannot be inherit into child class.
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(obj.f);

System.out.println("*****Scenario of reference and  object of parent class*****");

//Rule => We cannot call private member from parent class. eg test 3() 

Example3 obj1= new Example3();
obj1.test1();
obj1.test2();
//obj1.test3();  private method can not be called.
obj1.test4();
obj1.test5();
obj1.test6();


System.out.println(obj1.a);
System.out.println(obj1.b);
//System.out.println(obj.c); private member of parent class cannot be inherit into child class.
System.out.println(obj1.d);
System.out.println(obj1.e);
System.out.println(obj1.f);
System.out.println("*****Scenario reference of parent class and  object of child class*****");

//Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
//        b) Static method is strictly called from parent class. However public ,Protected and default methods are called from child class.


Example3 obj2= new TestExample3();
obj2.test1();
obj2.test2();
// obj2.test3();   private member of parent class cannot be inherit into child class.
obj2.test4();
obj2.test5();   // Static method is Strictly called from parent class
obj2.test6();

System.out.println(obj2.a);
System.out.println(obj2.b);
//System.out.println(obj2.c); // private member of parent class cannot be inherit into child class.
System.out.println(obj2.d);
System.out.println(obj2.e);
System.out.println(obj2.f);
}}
