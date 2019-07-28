package Abstract;

/*
 When abstract class implement interface then we can implement selected method based on our requirement. 
 so out of 3 method we are only defining one test3() in abstract class.
 Remaining 2 method will be defined in classB.
 */

public abstract class AbstractClassA implements InterfaceExample {
	
	public void test3() {
		System.out.println("Only single method test3() is implemented in abstract classB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
