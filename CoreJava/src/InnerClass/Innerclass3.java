package InnerClass;

public class Innerclass3 {

	
	int a= 800;
	
	public void test1() {
		System.out.println("I am from outer class");
	}
	
	public class innerA{
		
		public void test2()
		{
			System.out.println("I am from inner class innerA");
			test1();
			System.out.println(a);
		}
		
		public void showdata() {
			System.out.println(a);
		}
		
	}
	public static void main(String[] args) {

		Innerclass3 obj = new Innerclass3();
		Innerclass3.innerA obj2 = obj.new innerA();
		obj2.test2();
		
		System.out.println("************* Now trying to execute different method");
		
		obj2.showdata();
		
	}

}
