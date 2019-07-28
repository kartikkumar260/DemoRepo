package TryCatchBlock;

public class NestedTryBlok {

	public static void Test1() {
		
		// Scenario = Nested Inner try block will be executed sequentially 
		
		try {
			//first inner try block will be executed first
			try {
				int [] a = new int [5];
			     a[5] = 32; }
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
				System.out.println("Exeption of first inner try block is working ");
			}
			
			// Second inner try block will be executed second time
			try {
				int [] a = new int [5];
				a[4]= 32/0;
			} catch(ArithmeticException b) {
				System.out.println(b);
				System.out.println("Exeption of second inner try block is working ");
			}
		} catch (Exception c) {
			System.out.println(c);
			c.printStackTrace();
			
		}
	}
		
	// Scenario = forcefully throwing null pointer exception in first try block .Hence below exception will be handled by outer catch block.
	
		public void test2()
		{
			try {
				int [] a = new int [5];
				a[5] = 31/0;
			} catch(ArithmeticException a) {
				System.out.println("Exeption of first inner try block is working for Arithmetic Exception ");
				// forcefully throwing null pointer exception 
				//Hence below exception will be handled by outer catch block
				throw new NullPointerException ("I am forcefully applying null pointer exception");
			} 
			 
		// Second nested try block will not be executed as forced exception occurs.  
			try {
				int [] a = new int [5];
				a[5]=31;
				} catch(ArrayIndexOutOfBoundsException a) {
					System.out.println("Exeption of Second inner try block is working for Array index out of bound");
				}
			catch(Exception e) {
				System.out.println("Parent class exception will handle any exception");
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {
		NestedTryBlok ob = new NestedTryBlok();
		System.out.println("******Scenario 1 ******");
		ob.Test1();
		
		System.out.println("******Scenario 2******");
		ob.test2();

	}

}
