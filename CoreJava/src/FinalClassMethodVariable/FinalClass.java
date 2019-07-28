package FinalClassMethodVariable;
/*
 * 1. Final class cannot be extended by any other class.
 * 
 * 2. making a class , method and variable final help java to improve performance 
 * because jvm get opportunity to make assumption and optimization.
 * 
 * 3. All variable defined inside Interface are by default final.
 * 
 */



public class FinalClass {

	public void test1() {
		System.out.println("I am from final method ");
	}
}

/*
 Important Rule to remember
 1 => we use Final to prevent inheritance.
 2 => we use final to prevent method overloading. 
 */

