package This;
/*
By default global variable is given preference over local variable.
*/

public class ThisKeywordinJava3 {
	
	// global variable
	int a = 20 ;
	int b = 40 ;
	
	void test (int a , int b)// local variable
	{
		a=a;
		b=b;
	}
	
	void display() {
		System.out.println("Value of a and b==>"+a+","+b);
	}

	public static void main(String[] args) {
		ThisKeywordinJava3 ob = new ThisKeywordinJava3();
	
	    // defining local variable
		ob.test(50, 108);
		ob.display();

	}

}
