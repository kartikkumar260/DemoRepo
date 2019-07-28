package This;
/*
 * Scenario : Example when we will not use this keyword.  But still my code will work.
 * Solution =>  When naming of my local variable and global variable is not same.
 * 
 * 
 * Note => If name of global and local variable is same then then we have to use This() keyword to diplay local variable
 */

public class ThisKeywordinJava5 {
	
	// global variable
	int a = 51;
	int b = 91;
	
	// local variable name is different from global variable
	void test (int p ,int q)
	{
		a=p;
		b=q;
	}
	
	void display() {
		System.out.println(" value of a and b==> "+a+","+b);
	}

	public static void main(String[] args) {
		ThisKeywordinJava5 ob = new ThisKeywordinJava5();
		// defining local variable 
		ob.test(111, 222);
		ob.display();

	}

}
