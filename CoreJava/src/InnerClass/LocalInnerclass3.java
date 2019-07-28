package InnerClass;

/*
 * calling multiple method inside a local class
 */

public class LocalInnerclass3 {
	
	private int data = 5555;
	
	void display() {
		class localclass{
			void message() {
				System.out.println("I am from local inner class - A=="+data);
			}
			
			void message1() {
				System.out.println("I am from local inner class - B=="+data);
			}
		}
		localclass a = new localclass();
		a.message();
		a.message1();
	}

	public static void main(String[] args) {
	
		LocalInnerclass3 ab =new LocalInnerclass3();
		ab.display();

	}

}
