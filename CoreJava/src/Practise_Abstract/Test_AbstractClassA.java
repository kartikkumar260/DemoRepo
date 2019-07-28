package Practise_Abstract;

public class Test_AbstractClassA extends AbstractClassA{

	public static void main(String[] args) {
		Test_AbstractClassA ob =new Test_AbstractClassA();
		ob.test1();
		ob.test2();
		ob.test3();

	}

	@Override
	public void test1() {
	System.out.println("Remaining methods are called  from Test_AbstractClassA");	
	}

	@Override
	public void test2() {
	System.out.println("Remaining methods are called  from Test_AbstractClassA");	
		
	}

}
