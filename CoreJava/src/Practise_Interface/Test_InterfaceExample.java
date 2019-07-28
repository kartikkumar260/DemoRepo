package Practise_Interface;

public class Test_InterfaceExample implements InterfaceExample{

	// Rule => In required child class we have to write implementation of all the method. We can't skip a single method.
	
	@Override
	public void test1() {
	System.out.println("test1() has been successfully implemented in Test_InterfaceExample");
	}

	@Override
	public void test2() {
    System.out.println("test2() has been successfully implemented in Test_InterfaceExample");	
	}

	public static void main(String[] args) {
	/* Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
	   InterfaceExample ob = new InterfaceExample();
	 */
				
	// Rule = We can only create reference of interface 
		InterfaceExample ob = new Test_InterfaceExample();
		System.out.println(ob.i);
		System.out.println(ob.j);
		ob.test1();
		ob.test2();
	}
	


}
