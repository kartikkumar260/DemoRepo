package String;

public class StringExample1 {

	public static void main(String[] args) {
	
	int a = 100;
	int b =200;
	
	String x ="Hello";
	String y ="World";
	
	double c = 10.5;
	double d = 1.5;
	// Rule => Flow is always from left to right.
	System.out.println(a+b+x+y);
	System.out.println(x+y+a+b);  // important
	System.out.println(x+y+(a+b));//important
	System.out.println(a+b+x+y+a+b);
	System.out.println(y+a+b+x+y+a+x+b+y);
	
	System.out.println("**************************");
	System.out.println(c+d+x+y);
	System.out.println(x+y+c+d); // important
	System.out.println(x+y+(c+d)); // important
	System.out.println(y+a+b+y+a+x+b);
	
	

	}

}
