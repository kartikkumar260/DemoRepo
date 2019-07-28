package Inheritance;

public class ClassD extends ClassC{
	
	public void test4() {
		System.out.println("Class D having method as test4()");
	}

	public static void main(String[] args) {
		
		ClassD ob = new ClassD();
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		

	}

}
