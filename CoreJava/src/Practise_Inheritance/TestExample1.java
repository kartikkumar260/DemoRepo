package Practise_Inheritance;
/*
Scenario :- In parent class we have defined method (public , protected ,private ,default ,static and final ) and  variable (All ).
However in Child class we have defined method (public , protected ,private ,default ,static and final ) and  variable (All ).  
There is inheritance relationship between them.
*/

public class TestExample1 extends Example1 {

public void test1() {
System.out.println("Child class TestExample1 having overridden Public method test1()");
}

protected void test2() {
System.out.println("Child class TestExample1 having overridden Protected method test2()");
}

private void test3() {
System.out.println("Child class TestExample1 having overridden Private method test3()");
}

void test4() {
System.out.println("Child class TestExample1 having overridden Default method test4()");
}

public static void test5 () {
System.out.println("Child class TestExample1 having overridden Static method test5()");
}
/*
Rule => final method if defined in parent class that we cannot write required code for child class as 
              compile time error occurs. Hence commenting below piece of code.

public final test6() {
System.out.println("Child class TestExample1 having overridden Final method test2()");
}
*/

public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");

// Rule => We can override all method that are defined in parent class with child class.

TestExample1 obj= new TestExample1();
obj.test1();
obj.test2();
obj.test3();
obj.test4();
obj.test5();
obj.test6();

System.out.println("*****Scenario of reference and  object of parent class*****");

// Rule => We cannot call private method from parent class reference and object. eg test 3() 

Example1 obj1= new Example1();
obj1.test1();
obj1.test2();
//obj1.test3();  private method can not be called.
obj1.test4();
obj1.test5();
obj1.test6();

System.out.println("*****Scenario reference of parent class and  object of child class*****");

//Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
//        b) Static method is strictly called from parent class. However public ,Protected and default methods are called from child class.


Example1 obj2= new TestExample1();
obj2.test1();
obj2.test2();
// obj2.test3();   private method can not be called
obj2.test4();
obj2.test5();   // Static method is Strictly called from parent class
obj2.test6();
}}
