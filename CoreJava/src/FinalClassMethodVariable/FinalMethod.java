package FinalClassMethodVariable;

public class FinalMethod {

	            /*
	             * Rule = We cannot override final method .
	             */
	             public final void test5() {
		         System.out.println("Parnet class FinalMethod having Final method test5()");
	             } 
	
	
	           // public method
				public void test1() {
					System.out.println("Parnet class FinalMethod having public method test1()");
				}

				// private method
				private void test2() {
					System.out.println("Parnet class FinalMethod having private method test2()");
				}
			    
				// protected method
				protected void test3() {
					System.out.println("Parent  class FinalMethod having protected method test3()");
				}
				
				// static method
				public static void test4 () {
					System.out.println("Parnet class FinalMethod having static method test4()");
				}
				
				
				
				
	
}
