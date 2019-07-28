package InnerClass;

public class Innerclass2 {

	public void test1() {
		System.out.println("I am from outer class");
	}
	
	class Innerb {
		
		public void test2() {
			System.out.println("I am from inner class");
			test1();
		}
	}
	
	public static void main(String[] args)  {
		Innerclass2  obj = new Innerclass2();
		
		Innerclass2.Innerb obj2 = obj.new Innerb();
		obj2.test2();
	
	    
	}
}
