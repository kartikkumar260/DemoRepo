package JavaBasic;
/*
 * num= 151 , reverse =151. hence num= is palindrome.
 */
public class PalindromeNumber {
	
	
	public static void IsPalindrome(int num) {
		
		
    System.out.println("Given number is =="+num);
	int reminder =0;
	int reverse =0;
	int temp=0;
	
	temp =num;
	
	while(num>0) {
	reminder = num%10; // get the reminder 
	num=num/10;
	reverse=(reverse*10)+reminder;  
	
	}
	
	if (temp==reverse) // comparing temp with reverse number.
	{
		System.out.println("palindrome number");
	} else {
		System.out.println("Not a palindrome");
	}
	}
	
	
	public static void main(String[] args) {
    IsPalindrome(12124);
    IsPalindrome(151);
	}

}
