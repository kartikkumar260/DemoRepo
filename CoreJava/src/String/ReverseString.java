package String;
/*
 * Rule => There is no reverse function in string class.Since String is immutable object . 
 */
public class ReverseString {

	public static void main(String[] args) {
	
	String str = "Selenium";
	
	System.out.println("*********Using for loop ****************");
    
	int length =str.length();
	
	String rev ="";   // we must initialize this variable 
	
	for(int i =length-1 ; i>=0; i--) {
		rev= rev +str.charAt(i);
	}
	System.out.println(rev);
	
	System.out.println("*********using 'String Buffer' class we can call reverse method**************");
	
	StringBuffer sb = new StringBuffer(str);  // specify required string as argument.
	
	System.out.println(sb.reverse());
	
	
	
	
}
}