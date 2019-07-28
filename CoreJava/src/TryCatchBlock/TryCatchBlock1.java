package TryCatchBlock;

/* Rule of Try Catch Block are defined below
 
=	Try catch is used to handle any runtime exception that may occurs.
=	Try block will always associated with catch block. If we only have try block then compile time error will occur. 
=	Syntax of try catch block
 public void test1(){
 try {
 } catch() {
 }
 }

=	Catch block is used to handle the exception. It must be used after the try block only.
=	We can use multiple catch block with a single try.
=   Exception class has one method “print Stack  Trace()” . this (e.printStackTrace() ) will print error at  run time.

 */

public class TryCatchBlock1 {
	
	
	public void arthematicExceptionHandling() {
		try {
			int b= 9/0;
		} catch(Exception a) 
		{
			System.out.println("*****Parent class catch Exception handles all exception**********");
			a.printStackTrace(); // this exception method will help us to print error at run time.
			System.out.println("*****Code is running fine after try catch exception*************");
			
		}
		/*
		Scenario :- We cant write child class exception under parent class exception as this result in compile time error.
		
		catch(ArithmeticException e) // compile time error occurs if we write child exception below parent exception .
		 {
		System.out.println("*****Getting Arithematic exception**********");
		}
		 */
	}

	public static void main(String[] args) {
    
		TryCatchBlock1 ob = new TryCatchBlock1();
		ob.arthematicExceptionHandling();

	}

}
