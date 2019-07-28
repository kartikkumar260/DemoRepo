package InnerClass;

public class LocalInnerclass2 {

	
	
	private int data =108;
	
	void display() {
		
		class localinnerclassA{
			void message() {
				System.out.println(data);
			}
		}
		localinnerclassA ab = new localinnerclassA();
		ab.message();
	}
	
	void display1() {
		class localinnerclassA{
			void message() {
				System.out.println("I am from local inner class");
				}
		}
		localinnerclassA ab = new localinnerclassA();
		ab.message();
	}
	public static void main(String[] args) {
	
		LocalInnerclass2 ab= new  LocalInnerclass2();
		ab.display();
		ab.display1();

	}

}
