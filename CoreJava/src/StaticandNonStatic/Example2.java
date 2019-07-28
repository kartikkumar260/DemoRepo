package StaticandNonStatic;
/*
 * Static member 
 =They are class member. 
 Static member will be get execute once per class. 
 Static member get loaded to memory once
 In case of Static member, 
 even if we call it for 10 time then also it will not occupying extra space in memory. Since it is class member.
 
 
 
 Non Static member
 Where as non static member will get loaded as many as we create object.
e.g. if we create 2 or more object in java. 
Now when I call this method. Then in heap area of memory it will occupy space.

 */
public class Example2 {
	int a ;
	static int b;
	
	public void test1() {
		System.out.println(a =21);
		System.out.println(b=51);
	}
	
	public static void test2() {
		System.out.println(b=15);
	}

	public static void main(String[] args) {
		// static member are class member 
		// Even if static member is called 10 time then also it will only occupy extra space in memory
		// Always call static method or variable by class name.
		Example2.test2();
		System.out.println(Example2.b);
		
		
		// non static member will be loaded in heap area as many time we create objects.
		// If we create ten objects than non static member will get loaded to heap area in memory
		
		 Example2 obj = new  Example2();
		 obj.test1();
		 obj.test2();
		 System.out.println(obj.a);
		 System.out.println(obj.b);

	}

}
