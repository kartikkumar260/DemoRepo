package ReturnType;
/*
 * This example is of taking return on object of class.
 */
public class Example1 {

	
	public Example1 test1() {
		System.out.println("This example is of test class");
		// we are taking return on object of class
		return new Example1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj = new Example1();
	    obj.test1();
	}

}
