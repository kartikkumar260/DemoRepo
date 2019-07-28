package FinallyBlock;

public class FinallyBlockinJava2 {
/*
 * 
 */
	public void test1() {
		try {
			System.out.println("Inside try method");
			int [] a = new int[5];
			a[5] =30/2;   // ArrayIndexOutofBound
		} catch(NullPointerException e){
		System.out.println("Inside catch block ");
		System.out.println("Divide by zero");
		}
		finally {
	    System.out.println("Finally block execute even when exception not handled in catch block");
		}
	}

	public static void main(String[] args) {
		FinallyBlockinJava2 ob = new FinallyBlockinJava2();
		ob.test1();

	}
}
