package String;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
	int num = 12345678;
	int reverse = 0 ;  // we must initialize this variable 
	int reminder =0;
	
	while(num!=0) {
		//rev = rev *10 + num % 10; // we are taking remainder of number
		reminder =num%10;
		num = num/10;          
		reverse=(reverse*10)+reminder;
		
	}
System.out.println(reverse);
System.out.println("*********using 'String Buffer' class we can call reverse method**************");

int num1 = 243217;

StringBuffer sb = new StringBuffer(String.valueOf(num1));  // specified required integer in form of string as argument. 
System.out.println(sb.reverse());
	
	
	}

}
