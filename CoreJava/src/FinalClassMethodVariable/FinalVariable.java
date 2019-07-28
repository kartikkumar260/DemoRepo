package FinalClassMethodVariable;
/*
 * 
 Rule 1 = Final value must initialized . If it is not initialized then compile time error is  displayed.
  
 Rule 2 = When we try to initialize value of final variable(already initialized) through constructor  then compile time error occur.
 
 Rule 3 = If Final variable is not initialized then we can initialize through constructor of class.

 Rule 4 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.
  
  Rule 5 = If a variable is not final than its value can be reassigned successfully.
  
*/
public class FinalVariable {
	
	/*
Rule 1 = If a variable is not final than its value can be reassigned successfully.
	 */
	// case 1
	  int a =8;   // variable that is not final can be reassigned successfully
	  
	  void test1()
	  {
	  a=11;  // successfully able to reassign final variable 
	  }
	 
	  

	  /*
 Rule 2 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.
 
  final int x = 8;
			  
  void test2 (){
	x =12 ;  //compile time error will occurs if we try to reassign already initialized final variable
			  }
	   */
	  
	  /*
Rule 3 = Final value must initialized . If it is not initialized then compile time error is  displayed.
*/
 //  uninitialized final value will display compile time  error. e.g final int a;
 
  final int b =20;
  final int c = 55 ;

  
  /*
 Rule 4 = When we try to initialize value of final variable(already initialized) through constructor  then compile time error occur.
 
  finalVariable()  \\ using constructor if we try to initialize final variable then compile time error is displayed.
 {
   b = 55;  \\ compile time error is displayed.
   c = 55;  \\ compile time error is displayed.
 }
 */
  
 /*
  Rule 5 =If Final variable is not initialized then we can initialize through constructor of class.
  */
	final int k;
	FinalVariable() // using constructor if we try to initialize final variable then compile time error is displayed.
	  {
		  k = 125;
	  }
	
	public static void main(String[] args) {
  
		
		 FinalVariable ob = new  FinalVariable();
		 System.out.println("Calling a non final variable==="+ob.a);
		 System.out.println("Calling final variable b==="+ob.b);
		 System.out.println("Calling final variable c==="+ob.c);
		 System.out.println("Calling final variable k==="+ob.k);
	  }
  
  
	   
	 
			  
	
	
	

}
