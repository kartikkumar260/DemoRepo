package InnerClass;

public class LocalInnerclass {
	
	int data=80;
	
	void display() {
		class local{
			void message() {
				System.out.println(data);
			}}
			local a = new local();
		a.message();
		}


	public static void main(String[] args) {
		LocalInnerclass obj = new LocalInnerclass();
		obj.display();
		

	}

}
