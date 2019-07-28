package Practise_MethodOverriding;

public class TestExample2  extends Example2 {

	
public void test1() {
System.out.println("Child class TestExample2 having Public method test1() ");
}

protected void test2() {
System.out.println("Child class TestExample2 having Protected method test2()");
}

private void test3() {
System.out.println("Child class TestExample2 having Private method test3()");
}

void test4() {
System.out.println("Child class TestExample2 having Default method test4()");
}

public static void test5() {
System.out.println("Child class TestExample2 having Static method test5()");
}
/*
Rule => final method if defined in parent class that we cannot write required code for child class as 
        compile time error occurs. Hence commenting below piece of code.

public static final test6() {
System.out.println("Child class TestExample2 having Final method test6()");
}
 */
public static void main(String[] args) {

System.out.println("*****Scenario of reference and object of child class*****");
// Rule => We can override all method that are defined in parent class with child class.

TestExample2 ob = new TestExample2();
ob.test1();
ob.test2();
ob.test3();
ob.test4();
ob.test5();
ob.test6();

System.out.println("*****Scenario of reference and  object of parent class*****");

//Rule => We cannot call private method from parent class reference and object. eg test 3();

Example2 ob1= new Example2();
ob1.test1();
ob1.test2();
//obj1.test3();  private method can not be called.
ob1.test4();
ob1.test5();
ob1.test6();

System.out.println("*****Scenario reference of parent class and  object of child class*****");

//Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
//      b) Static method is strictly called from parent class. However public ,Protected and default methods are called from child class.

Example2 ob2= new TestExample2();
ob2.test1();
ob2.test2();
//obj2.test3();   private method can not be called from parent class reference.
ob2.test4();
ob2.test5();  // Static method is Strictly called from parent class
ob2.test6();



}

}
