package ReturnType;

/*
 Return type => Output return by method is called return type.
 
 Return type => Return outcome by method is called return type
 
 
 String is sequence of character  . It specified by double quote (" ").
 
 Character is single character . It is specified by single quote ( ' ').
 */
public class Example {

	
	public void test1() {
		System.out.println("void test1()");
	}
	
	public int test2() {
		System.out.println("int test2()");
		return 2;
	}
	
	public double test3() {
		System.out.println("double test3()");
		return 2.7;
	}
	
	public boolean test4() {
		System.out.println("boolean test4()");
		return false;
	}
	
	public char test5() {
		System.out.println("char test5() ");
		return 'c';
	}

	public String test6() {
		System.out.println("String test6()");
		return "YES";
	}
	public static void main(String[] args) {

		Example obj = new Example();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
	}

}
