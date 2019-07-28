package TryCatchBlock;

/*
=	Inside try block we can write  one more try and catch block. Again I have multiple catch block.
=	Whenever there exception in internal try then it will go internal catch.
Note => The internal try exception will never go to external catch.

 */

public class MultipleCatchBlock1 {
	// scenario => We are able to handle internal try block using internal catch
	public void test1() {
		try {
			try {
				int [] a = new int[5];
				a[5] = 31/0;
				
			} catch (Exception e) {
				System.out.println("I am from innner try catch block of test1()");
				e.printStackTrace();
			}
		} catch (ArithmeticException e) {
			System.out.println("****Outer Arithemet exception is solved****");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("****Outer Array Index out of bound exception is solved***");
		} catch(NullPointerException a) {
			System.out.println("****Outer Null Pointer Exception is solved***");
		}System.out.println("****Rest of code is running successfully for test1() method***");
	}

	// scenario => We are forcefully throwing error through internal catch . This will be handled by outer catch block
	
	public void test2() {
		try {
			try {
				int [] a = new int [5];
				// array index out of bond error message should be displayed
				a[5] = 50/1;
			} catch (Exception e) {
				System.out.println("I am fom inner try catch block of test2()");
				e.printStackTrace();
				// We are forcefully throwing null pointer exception . Hence outer null point exception will execute
				throw new NullPointerException ("****I am forceble Nullpointer exception that will be solved by outter catch");
			}
		} catch( ArithmeticException a) {
			System.out.println("****Outer Arithmetic exception of method test 2()");
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("****Outer Array Index out of bound of method test2()");
			} catch (NullPointerException a) {
				System.out.println("Outer Nullpointer exception of method tst2()");
			} System.out.println("*****Rest code is running successfully for test2() method****");
	}
	public static void main(String[] args) {
		MultipleCatchBlock1 ob = new MultipleCatchBlock1();
		
		System.out.println("************Scenario 1*************");
		ob.test1();
		
		System.out.println("************Scenario 2*************");
		ob.test2();


	}

}
