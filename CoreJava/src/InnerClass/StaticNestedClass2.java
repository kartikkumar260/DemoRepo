package InnerClass;
/*
 Example of Static method inside in inner class?
Rule 
=	Static member can only be called in static method.
=	Non static member cant be called in static method as compile time error is displayed.

 */
public class StaticNestedClass2 {
	
	static int data =21;
	
	static void display() {
		System.out.println("data ==>"+data);
		System.out.println("I am from outer class");
	}

	static class inner {
		void message() {
			System.out.println("I am from innerclas");
			System.out.println(data);
			System.out.println("********************");
			display();
			System.out.println("$$$$$$$$$$$$$$$$$$$$");
		}
	}
	public static void main(String[] args) {
	
		StaticNestedClass2.inner obj =new StaticNestedClass2.inner();
		obj.message();
		// Java basic i.e. static method called by class name.
		StaticNestedClass2.display();
	}

}
