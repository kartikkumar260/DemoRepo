package String;

public class StringExample2 {
	
	
	public static void main(String[] args) {
		
		int a =21;
		int b= 11;

		if(a>b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is greater than A");
		}
		/*
		 Comparison operator 
		 < > ,<= , >= , == ,!=
		 */
		int c =51;
		int d= 51;
		// i
		if (c==d) {
			
			System.out.println("c and d are equal ");
		} else {
			System.out.println("c and d are not equal");
		}
		
		// write a logic to find highest number
		int a1= 100;
		int b1 =200;
		int c1= 300;
		
		// nested if else condition
		if( a1>b1 & a1>c1) {
			System.out.println("a1 is greatest ");
		} else if (b1>c1) {
			System.out.println("b1 is greatest");
		} else {
			System.out.println("c1 is greatest");
		}
	}



}