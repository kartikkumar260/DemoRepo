package JavaBasic;

import java.util.Scanner;

public class AtRuntimeCalculator {

	public static void main(String[] args) {
	
	double num1 ,num2 ,output;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number == >");
	num1 =sc.nextDouble();
	System.out.println("Second  first number == >");
	num2 =sc.nextDouble();
	
	
	System.out.println("Enter Operator (+ ,- ,*,/) ==>  ");
	char op=sc.next().charAt(0);
	
	sc.close();
	
	switch(op) {
	  
	case '+' :
		output =num1+num2;
		break;
		
		
	case '-' :
		output= num1-num2;
		break;
		
	
	case '*':
		output= num1*num2;
		break;
		
	case '/':
		output =num1/num2;
		break;
	
	
	default :
		System.out.println("Invalid operator is entered by you");
		return;
	}

	System.out.println(num1+" "+op+" "+num2+" output ===>  "+output);
	}

}
