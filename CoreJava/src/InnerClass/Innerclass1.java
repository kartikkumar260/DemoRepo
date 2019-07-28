package InnerClass;

public class Innerclass1 {
	
	class innerA{
		
		public void test1() {
			System.out.println("I am from inner class inner A");
		}
	}
	
	class innerB{
		public void test2() {
			System.out.println("I am from inner class inner B");
		}
	}

	public static void main(String[] args) {

		
		  Innerclass1 obj = new Innerclass1 ();
		// excess inner class by outer class
		// through reference of outer class we cannot access member of inner class. eg.  obj we cannot access method of inner class.
		  
		  Innerclass1.innerA  obj1 = obj.new innerA();
		  obj1.test1();
		  
		  Innerclass1.innerB obj2 = obj.new innerB();
		  obj2.test2();
	
		

		
		

	}

}
