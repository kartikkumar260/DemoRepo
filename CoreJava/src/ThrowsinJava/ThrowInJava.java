package ThrowsinJava;

/*
 Rule
 1 The Java through keyword is used to explicitly (forcefully) throw an exception.
 2 We can throw either checked or unchecked exception in java by throw keyword.
 3 The throw keyword is used to throw custom exception.
 
 Note => When we want to throw exception based on condition then we can use throw keyword.
      => This will help us to throw exception at runtime.
 */

public class ThrowInJava {
	
	public void ValidateAge(int age) {
		if (age<18) {
			throw new ArithmeticException("Person age is not valid for voting");
		} if (age>18) {
			System.out.println("Person is autherized for voting in election");
		}
	}

	public static void main(String[] args) {
		ThrowInJava ob = new ThrowInJava();
		ob.ValidateAge(19);
        ob.ValidateAge(12);
	}

}
