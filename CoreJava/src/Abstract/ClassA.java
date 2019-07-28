package Abstract;

/*
  When  a normal class implement interface then it has to implement all method of Interface.
 */

public class ClassA implements  InterfaceExample{


	@Override
	public void test1() {
		System.out.println("test1() method is implemented in Class A");
	}

	@Override
	public void test2() {
		System.out.println("test2() method is implemented in Class A");
	}

	@Override
	public void test3() {
		System.out.println("test3() method is implemented in Class A");
		
	}

	public static void main(String[] args) {
		InterfaceExample ob = new ClassA();
		ob.test1();
		ob.test2();
		ob.test3();

	}
}
