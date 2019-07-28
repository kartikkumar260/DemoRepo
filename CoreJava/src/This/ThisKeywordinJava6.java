package This;
/*
 * In case if we are not using this() keyword then at run time global value will override local value.
 */

public class ThisKeywordinJava6 {
	
	int a=4 ;
	int b=5;
	
	void test1(int a ,int b) {
		// global value of a and b are not assigned with local value. 
		//Hence at run time global value will override local value.
		a=a;
		b=b;
		
		System.out.println("Local variable a and b value =="+a+","+b);
		System.out.println("Global variable a and b value=="+this.a+","+this.b);
	}
	
	
	void display() {
		System.out.println("Actual Result of a and b variable =="+a+"," +b);
	}

	public static void main(String[] args) {
		ThisKeywordinJava6 ob = new ThisKeywordinJava6();
		ob.test1(9, 21);
		ob.display();

	}

}
