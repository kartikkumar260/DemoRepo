package Inheritance;
/*
 * This scenario define below mentioned points 
 * 
   a) Final method if defined in parent class that we can not write required code for child class as compile time error occurs.
  
   b) If we create reference and object of child class. 
	  Result => We can override all method that are defined in parent class with child class
	 
   c) If we create reference and object  of parent class.
	 Result => We cannot call private method from parent class reference and object.
     Result =>  Rest all method are called from parent class.
     
     
   d) If we create reference of parent class  and object of child class.
	 Rule =>  We cannot call private method from parent class reference and object of child class.
	 Rule =>  Static method is strictly called from parent class. 
 */


public class TestExample1 extends Example1{

	// public method
			public void test1() {
				System.out.println("Child class TestExample1 having override  public method test1()");
			}

			// private method
			private void test2() {
				System.out.println("Child class TestExample1 having override  private method test2()");
			}
		    
			// protected method
			protected void test3() {
				System.out.println("Child class TestExample1 having protected method test2()");
			}
			// static method
			public static void test4 () {
				System.out.println("Child class TestExample1 having override  static  method test4()");
			}
			
			// final method if defined in parent class that we can not write required code for child class as compile time error occurs
			/*
			 * public final void test5 () {
			 * 	System.out.println("Child class TestExample1 having final method test4()");
			}
			 */
			
		public static void main(String[] args) {
			
		/*
		 If we create reference and object of child class. 
	     Result => We can override all method that are defined in parent class with child class
	 
		 */
			System.out.println(" ***********Scenario of reference and object of child class ***********");
			TestExample1 ob = new TestExample1();
			ob.test1();
			ob.test2();
			ob.test3();
			ob.test4();
			ob.test5();
			
			
			System.out.println(" ***********Scenario of reference and  object of parent class ***********");
         /*
         If we create reference and object  of parent class.
	     Result => We cannot call private method from parent class reference and object.
         Result =>  Rest all method are called from parent class.
         */
			Example1 ob1 = new Example1();
			ob1.test1();
			ob1.test3();
			ob1.test4();
			ob1.test5();
			
			
			System.out.println(" ***********Scenario reference of parent class  and object of child class ***********");
       /*
       If we create reference of parent class  and object of child class.
	    Rule =>  We cannot call private method from parent class reference and object of child class.
	    Rule =>  Static method is strictly called from parent class. 
        */
			Example1 ob2 = new TestExample1();
			ob2.test1();
			ob2.test3();
			ob2.test4();  // Static method is strictly called from parent class. 
			ob2.test5();
			
		}

}
