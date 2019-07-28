package Interface;

public class TestInterfaceAB  implements InterfaceA , InterfaceB
{

	// These method and variable specifically written for TestInterfaceAB
	
	// in case of class its our discretion if we want to initialize variable
	int e;
	final int f=5;
	
	public void test5() {
		System.out.println("test5() method specifically belong to TestInterfaceAB");
	}
	
	public void test6() {
		System.out.println("test6() method specifically belong to TestInterfaceAB");
	}

	// rest all are unimplemented method of respected InterfaceC , InterfaceD
	@Override
	public void test1() {
		System.out.println("test1() method has been implemented in TestInterfaceAB");
		
	}

	@Override
	public void test2() {
		System.out.println("test2() method has been implemented in TestInterfaceAB");
		
	}

	@Override
	public void test3() {
		System.out.println("test3() method has been implemented in TestInterfaceAB");
		
	}

	@Override
	public void test4() {
		System.out.println("test4() method has been implemented in TestInterfaceAB");
		
	}
	public static void main(String[] args) {
		/*
		 *Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
		 *InterfaceA ob = new InterfaceA();
		 *InterfaceB ob1 = new InterfaceB();
		 */
				
   // Rule = We can only create reference of interface and can only access methods and variable of this interface only.
		System.out.println("******************* We are using reference of InterfaceA*******************");
		InterfaceA ob = new TestInterfaceAB();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.test1();
		ob.test2();
	
		
	// Rule = We can only create reference of interface and can only access methods and variable of this interface only.
		System.out.println("******************* We are using reference of InterfaceB*******************");
		InterfaceB ob1 = new TestInterfaceAB();
		System.out.println(ob1.c);
		System.out.println(ob1.d);
		ob1.test3();
		ob1.test4();
		
		// using reference and object of Testclass we can access all method and variable of InterfaceA , InterfaceB and Testclass.
		System.out.println("******************* We are using reference and object of TestInterfaceAB()*******************");
		TestInterfaceAB ob2 = new TestInterfaceAB();
		
		// all method and variable of InterfaceA
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		ob2.test1();
		ob2.test2();
		
		// all method and variable of InterfaceB
		System.out.println(ob2.c);
		System.out.println(ob2.d);
		ob2.test3();
		ob2.test4();
		
		// all method and variable of TestInterface class
		System.out.println(ob2.e);
		System.out.println(ob2.f);
		ob2.test5();
		ob2.test6();
		
		

		
		

	}


}
