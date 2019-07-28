package TryCatchBlock;

/*
=	One try block can be associated with more than one catch block.
=	So from multiple exception we can select required exception.
=   Code will go through catch block () in sequential manner. Then it decide which particular exception to select

Let take example of multiple catch. 
int a[] = new int [5];      // array size is 5 which mean it start from 0 ,1,2,3,4
a[5] = 30/0;  
// 30/0 will cause arithmetic exception.
//a[5] will cause array out of array out of bound exception. 
 Since we are  array size is 5 and we are trying to store data in 6th position.
 */

public class MultipleCatchBlock {
	
	public void multiplecatchblock1() {
		try {
			int a[] = new int[5];
			// In below scenario there is arithmetic Exception and Array Index out of bound exception .
			// Result will be displayed for Arithmetic exception as this will be found first.
			a[5] =30/0;
		} 
	catch (ArithmeticException a) {
			System.out.println("*********Getting Arithmetic Exception ***************");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("*********Getting Array Index out of bounds Exception***********");
		} catch (Exception a) {
			System.out.println("*********Parent class exception will handle any type of exception********");
			a.printStackTrace(); // @runtime this method will print exact error
		} /*
		Scenario :- We cant write child class exception under parent class exception as this result in compile time error.
		
		catch (NullPointerException a) // compile time error occurs if we write child class exception under parent eception
		{
			System.out.println("**********Getting Nullpointer Exception");
		 */
		System.out.println("**Rest of code is executed for scenario 1**");
	}

	
	public void multiplecatchblock2() {
		try {
			int a[] = new int[5];
			// In below scenario there is only  Array Index out of bound exception .
			// Result will be displayed for Array Index out of bound exception as this will be found first.
			a[5] =30/1;
		} catch (ArithmeticException a) {
			System.out.println("*********Getting ArithmeticException ***************");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("*********Getting Array Index out of bounds Exception***********");
		} catch (Exception a) {
			System.out.println("*********Parent class exception will handle any type of exception********");
			a.printStackTrace();// @runtime this method will print exact error
		}
		System.out.println("**Rest of code is executed for scenario 2**");
	}
	
	public void multiplecatchblock3() {
		try {
			/*
	Scenario  => Super exception  (Exception e) will get executed when there is exception which will not match to any catch() block.
			 */
			Class.forName("!$%%$^^^^"); // Invalid class name 
		} catch (ArithmeticException a) {
			System.out.println("*********Getting ArithmeticException ***************");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("*********Getting Array Index out of bounds Exception***********");
		} catch (Exception a) {
			System.out.println("*********Parent class exception will handle any type of exception********");
			a.printStackTrace();// @runtime this method will print exact error
		}
		System.out.println("**Rest of code is executed for scenario 3**");
	}
	public void multiplecatchblock4() //throws ClassNotFoundException 
	
	/*
 Scenario => If above commented (throws ClassNotFoundException ) is used  along with parent class exception then Entire code
           donot work with runtime error. Hence commenting it 
	 */
	{
		try {
			// If below code is handled by throws exception than 
			Class.forName("!$%%$^^^^"); // Invalid class name 
		} catch (ArithmeticException a) {
			System.out.println("*********Getting ArithmeticException ***************");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("*********Getting Array Index out of bounds Exception***********");
		} catch (Exception a) {
			System.out.println("*********Parent class exception will handle any type of exception********");
			a.printStackTrace();// @runtime this method will print exact error
		}
		System.out.println("**Rest of code is executed for scenario 4**");
	}
	public static void main(String[] args) {
		System.out.println("***************Scenario 1*****************");
		MultipleCatchBlock ob = new MultipleCatchBlock();
		//ob.multiplecatchblock1();
		
		System.out.println("***************Scenario 2*****************");
		//ob.multiplecatchblock2();

		System.out.println("***************Scenario 3*****************");
		ob.multiplecatchblock3();
		
		System.out.println("***************Scenario 4*****************");
		ob.multiplecatchblock4();

	}

}
