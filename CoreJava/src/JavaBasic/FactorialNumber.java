package JavaBasic;

public class FactorialNumber {
	
	
	public static int factorial(int num) {
		System.out.println("Given number is ==>"+num);
		
		int fact =1 ;  // Must be initialize with 1. If not uninitialized (0) then program fails.
		
		if(num==0) { // if user enter number as 0 then 1 is returned.
			return 1;
		}
		for(int i=1;i<=num;i++) {
			
	    fact=fact*i;	
		}
		return fact;
	}

	//Scenario =>  With Recursive function => A function is calling it self
	public static int fact(int num) {
		if(num==0)
		return 1;
		else
		return (num * fact(num-1));
	}
	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(9));
		
		System.out.println("******************Using Recursive function************ ");
		
		System.out.println(fact(5));
		System.out.println(fact(7));

	}

}
