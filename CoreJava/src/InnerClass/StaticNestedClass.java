package InnerClass;

/*
 Rules of static nested class
1.	Outerclassdot(.) Inner class object reference.
2.	New Object of Outerclassdot(.) Inner class object.
3.	Using above object call static method.

 */

public class StaticNestedClass {
	
	static int data =11;
	
	
	static class inner{
		void display() {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {

		StaticNestedClass.inner ab = new StaticNestedClass.inner();
		ab.display();
	}

}
