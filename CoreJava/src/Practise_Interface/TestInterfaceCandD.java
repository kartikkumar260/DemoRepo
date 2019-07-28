package Practise_Interface;

public class TestInterfaceCandD implements InterfaceC , InterfaceD{
	
	public static final int f=5;

	public static void test4() {
	System.out.println("Static method test4() belong to TestInterfaceCD class");
	}

	public static void main(String[] args) {

		
		TestInterfaceCandD ob = new TestInterfaceCandD();
	// calling static method and variable using class name
    System.out.println(TestInterfaceCandD.f);
    TestInterfaceCandD.test4();
    
 // calling other variables and method of respected interface
    System.out.println(ob.i);
    System.out.println(ob.j);
    System.out.println(ob.k);
    System.out.println(ob.f);
    ob.sum();
    ob.sub();
    ob.multiply();
	}

	@Override
	public void multiply() {
	System.out.println("Multiply of i*j*k "+(i*j*k));
	System.out.println("Multiply of i*j"+(i*j));
	System.out.println("Multiply of j*k"+(j*k));
	}

	@Override
	public void sum() {
		System.out.println("Sum of i ,j ,k "+(i+j+k));
		System.out.println("Sum of i,j"+(i+j));
		System.out.println("Sum of j ,k"+(j+k));
	}

	@Override
	public void sub() {
		System.out.println("Sub of i ,j ,k "+(i-j-k));
		System.out.println("Sub of i,j"+(i-j));
		System.out.println("Sub of j ,k"+(j-k));
		
	}

}
