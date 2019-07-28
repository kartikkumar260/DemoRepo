package String;

public class StringSwap {

	public static void main(String[] args) {
		/*
		 String swap without using temp/ third variable.
		 */
		
		String a ="Hello";
		String b= "World";
		
		System.out.println("Before swapping ");
		System.out.println(a);
		System.out.println(b);
		
		// step 1 append value of A and B
		a=a+b; // helloWorld
		
		// Step 2 store initial string A in string b.
		b=a.substring(0, a.length()-b.length());    //   a.length = 10 ,b.length = 5.
		
		// store initial string b in string a
		
		a=a.substring(b.length());
		
		System.out.println("After swapping ");
		System.out.println(a);
		System.out.println(b);
	
	}

}
