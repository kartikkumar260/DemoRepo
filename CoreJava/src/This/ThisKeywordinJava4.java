package This;
/*
 * this() keyword help us differentiate   between local and global variable.
 * Using this() keyword local variable is given preference over global variable.
 */

public class ThisKeywordinJava4 {
	
	int a = 51;
	int b = 108;
	
	void test(int a , int b)
	{
		this.a=a;
		this.b =b;
	}
	
	void display() {
		System.out.println("Value of a and b ==>"+a+","+b);
	}
	public static void main(String[] args) {
		ThisKeywordinJava4 ob =new ThisKeywordinJava4() ;
		// defining local variable
		ob.test(5 ,7);
		ob.display();

	}

}
