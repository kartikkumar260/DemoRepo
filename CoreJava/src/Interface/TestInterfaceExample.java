package Interface;
/*
 Rule = whenever any class implement any interface then we have to write implementation of all the method. We cannot skip a single method. 
If we try to skip any method then compile time error occurs. 

 */

public class TestInterfaceExample implements InterfaceExample {



	@Override
	public void test1() {
		System.out.println("test1() method has been implemented in TestInterfaceExample");
	}

	@Override
	public void test2() {
		System.out.println("test2() method has been implemented in TestInterfaceExample");
		
	}
	
	@Override
	public void test3() {
		System.out.println("test3() method has been implemented in TestInterfaceExample");
		
	}

	@Override
	public void test4() {
		System.out.println("test4() method has been implemented in TestInterfaceExample");
		
	}
	public static void main(String[] args) {

/*
 *Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
 *InterfaceExample ob = new InterfaceExample();
 */
		
	// Rule = We can only create reference of interface 
		InterfaceExample ob = new TestInterfaceExample();
		
		System.out.println(ob.i);
		System.out.println(ob.j);
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		

	}
}
