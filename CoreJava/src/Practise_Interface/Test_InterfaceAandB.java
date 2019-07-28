package Practise_Interface;

public class Test_InterfaceAandB implements InterfaceA , InterfaceB {

	// These method and variable specifically written for TestInterfaceAB
	
		// in case of class its our discretion if we want to initialize variable
	
	int e;
	final int f=39;
	
	void test5() {
	System.out.println("test5() specifically belong to TestInterfaceAandB ");	
	}
	
    void test6() {
    System.out.println("test6() specifically belong to TestInterfaceAandB ");
	}

	
	
	public static void main(String[] args) {
		
	/*
	 *Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
	 *InterfaceA ob = new InterfaceA();
	 *InterfaceB ob1 = new InterfaceB();
    */
		
	// Rule = We can only create reference of interface and can only access methods and variable of this interface only.
	System.out.println("******************* We are using reference of InterfaceA*******************");
	InterfaceA ob = new Test_InterfaceAandB();
	System.out.println(ob.a);
	System.out.println(ob.b);
	ob.test1();
	ob.test2();

	System.out.println("******************* We are using reference of InterfaceB*******************");
	InterfaceB ob1 = new Test_InterfaceAandB();
	System.out.println(ob1.c);
	System.out.println(ob1.d);
	ob1.test3();
	ob1.test4();
	
	// using reference and object of Testclass we can access all method and variable of InterfaceA , InterfaceB and Testclass.
	System.out.println("******************* We are using reference and object of TestInterfaceAB()*******************");
	Test_InterfaceAandB ob3 = new Test_InterfaceAandB();
	
	// all method and variable of interfaceA
	System.out.println(ob3.a);
	System.out.println(ob3.b);
	ob3.test1();
	ob3.test2();
	
	// all method and variable of interfaceB
	System.out.println(ob3.c);
	System.out.println(ob3.d);
	ob3.test3();
	ob3.test4();
	
	// all method and variable of Test_InterfaceAandB  class
	System.out.println(ob3.e);
	System.out.println(ob3.d);
	ob3.test5();
	ob3.test6();
	
	}

	@Override
	public void test3() {
		System.out.println("test3() method is implemented in Test_InterfaceAandB");
		
	}

	@Override
	public void test4() {
		System.out.println("test4() method is implemented in Test_InterfaceAandB");
		
	}

	@Override
	public void test1() {
	System.out.println("test1() method is implemented in Test_InterfaceAandB");
	}

	@Override
	public void test2() {
	System.out.println("test2() method is implemented in Test_InterfaceAandB");
	}

	
}
