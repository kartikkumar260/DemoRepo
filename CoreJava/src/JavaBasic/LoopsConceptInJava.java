package JavaBasic;

public class LoopsConceptInJava {

	public static void main(String[] args) {
	/*
	 While Loop => 
	 
	 disadvantage of while loop is that it will generate infinite loop if you dont give increment or decrement part.
	 */
System.out.println("*************Scenario of While loop*************");
	int  i = 1; // initialize
	while (i<=10) { // condition
		System.out.println(i);
		i=i+1;  // increment or decrement.
	}
	
System.out.println("*************Scenario of For loop increment*************");

for (int j=0 ; j<=11 ;j++) {  // initialize , condition , Increment 
	System.out.println(j);
}

System.out.println("*************Scenario of For loop decrement*************");

for (int k=10 ;k>=0 ; k--) {   // initialize , condition , Decrement
	System.out.println(k);
}


	}

}
