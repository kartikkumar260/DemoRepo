package Abstract;
/*
 c)	Create a normal class B and extend abstract class AbstractClassA 
  Observe as a result method that were not implemented in interface previously will be displayed .
 */

public class ClassB extends AbstractClassA {
	
	@Override
	public void test1() {
	System.out.println("Remaining methods are called  from classB");
		
	}

	@Override
	public void test2() {
		System.out.println("Remaining methods are called  from classB");
		
	}
	

	public static void main(String[] args) {
		ClassB ob = new ClassB();
		ob.test1();
		ob.test2();
		ob.test3();

	}





}
