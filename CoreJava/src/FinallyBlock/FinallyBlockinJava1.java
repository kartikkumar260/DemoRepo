package FinallyBlock;
/*
 * We can write Try block without catch block if there is finally block. 
 */

public class FinallyBlockinJava1 {
	
	public void test1() {
		try {
			int [] a = new int[5];
			a[5] =30/2;
		} finally {
			System.out.println("Finally block is always execute even when we dont have catch block");
		}
	}

	public static void main(String[] args) {
		FinallyBlockinJava1 ob = new FinallyBlockinJava1();
		ob.test1();

	}

}
