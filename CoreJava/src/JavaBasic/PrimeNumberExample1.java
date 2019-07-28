package JavaBasic;

public class PrimeNumberExample1 {
	
// Scenario => If we want to verify if a given number is prime or not.	
public static boolean isPrimenumber(int num) {
System.out.println("Given number is ==>"+num);
if(num==0) {
return false;	
}

for(int i=2 ; i<num;i++) //
{
if (num%i==0) {
return false;
}
}
return true;
}

// scenario => To fetch prime number from 2 to 87
/*
 public static void getlistofPrimenumber(int num) {
System.out.println("Prime number upto "+num);	
System.out.println();
for(int i=2; i<=num;i++) // condition must be "i<= num" since we also have to compare last number.
{
if(isPrimenumber(i)) 
	System.out.print(i+ " ");
}
}
 */


public static void main(String[] args) {
System.out.println("Is 87 a prime number ==>  "+isPrimenumber(87));
System.out.println("Is 17 a prime number ==>  "+isPrimenumber(17));

}}