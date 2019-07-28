package This;

public class ThisKeywordinJava1 {

	int a = 5;
	int b = 32;
	int c = 81;
	static int d;
	
	void test1() {
		this.test2();
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		
		System.out.println("I am from test1() method ");
	}
	void test2() {
		
		System.out.println("I am from test2() method ");
	}
	void test3(int a) {
		
		System.out.println("I am from test3() method");
	}
	void test4(ThisKeywordinJava1 ob) {
		
		System.out.println("I am from test4() method");
		System.out.println(ob.getClass().getName()); 
		// it will display "Package name" then class name .eg "This.ThisKeywordinJava1" .
	}
	
	void test5() {
		test4(this);
		test3(4);
	}
	public static void main(String[] args) {
	
		ThisKeywordinJava1 ob=new ThisKeywordinJava1();
		ob.test5();
		System.out.println("**************Scenario 1********");
		ob.test4(ob);
		System.out.println("**************Scenario 2********");
		ob.test1();
	}

}
