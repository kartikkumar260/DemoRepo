package ThrowsinJava;
/*
 Rule of throws
 1. In Java throws keyword is used to declare an exception
 2. Exception can be  (forwarded in calling method or stack (method)
 3. It provide information to caller of method about exception.
 note = Caller means main (method) that is calling method that has exception 
 */
public class ThrowsInJava {
	
	public void ValidateAgeofvoter(int age) throws ArithmeticException{
		if (age<18) {
			throw new ArithmeticException ("Required person age is not valid for voting");
		} else {
			System.out.println("Person is valid for voting ");
		}
	}



}
