package Interface;

public class TestInterfaceCD implements InterfaceC , InterfaceD {
	
	// These method and variable specifically written for TestInterfaceAB
	
		// in case of class its our discretion if we want to initialize variable
		int e;
		public static final int f=5;
		
		public static void test4() {
			System.out.println("Static method test4() belong to TestInterfaceCD class");
		}

// rest all are unimplemented method of respected InterfaceC , InterfaceD
	@Override
	public void subtract() {
	System.out.println("Subtract of k ,j and  i==>"+(k-j-i));
	
	System.out.println("Subtract of j and  i==>"+(j-i));
		
	}

	@Override
	public void Sum() {
		System.out.println("Sum of k ,j and  i==>"+(k+j+i));
		
		System.out.println("Sum of j and  i==>"+(j+i));
			
		
	}

	@Override
	public void multiply() {
System.out.println("Multiply of k ,j and  i==> "+(k*j*i));
		
		System.out.println("Multiply of j and  i==>"+(j*i));
		
	}
		public static void main(String[] args) {
	
			TestInterfaceCD ob = new TestInterfaceCD();
			// calling static method and variable using class name
			System.out.println(TestInterfaceCD.f);
			TestInterfaceCD.test4();
			
			// calling other variables and method of respected interface
			System.out.println(ob.i);
			System.out.println(ob.j);
			System.out.println(ob.k);
			System.out.println(ob.e);
			ob.subtract();
			ob.Sum();
			ob.multiply();
		

		}

	

}
