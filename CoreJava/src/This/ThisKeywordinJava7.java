package This;

public class ThisKeywordinJava7 {
	/*
	 * In case if we are using this() keyword then at run time local value will override global value.
	 */
	int a ;
	int b;
	
	void test1(int a ,int b) {
		// global value of a and b are assigned with local value. Hence in any case local value will only be displayed.
		this.a=a;   
		this.b=b;
		
		System.out.println("local variable a and b value =="+a+","+b);
		System.out.println("global variable a and b value=="+this.a+","+this.b);
	}
	
	void display() {
		System.out.println("Actual Result of a and b variable =="+a+"," +b);
	}

	public static void main(String[] args) {
		ThisKeywordinJava7 ob = new ThisKeywordinJava7();
		ob.test1(9, 21);
		ob.display();

	}

}