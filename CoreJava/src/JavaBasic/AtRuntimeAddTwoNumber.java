

package JavaBasic;

import java.util.Scanner;

public class AtRuntimeAddTwoNumber {

	public static void main(String[] args) {
	 int x ,y,z;
	 System.out.println("Enter two intiger @ Runtime and add them");
	 Scanner in = new Scanner(System.in) ;
	 
	 x =in.nextInt();
	 y =in.nextInt();
	 z= x+y;
	 System.out.println("Sum of two number ==>  "+z);

	}

}

