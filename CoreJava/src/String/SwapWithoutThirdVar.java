package String;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {

	int x=5;
	int y=10;
	
	// Required output x=10 and y=5
	
	
	/*
	case 1 using third variable : t
	int t;
	t=x;   //5
	x=y;   //10
	y=t;   //5
	 */

	/*case 2 without  using third variable : using + operator
	x=x+y;  // 15
	y=x-y; //5
	x=x-y ;// 10
	*/
	
	/*
	 * case 3 without  using third variable : using * operator
	x=x*y;  // 50
	y=x/y; //5
	x=x/y ;// 10
  
	 */
	
	// case 4 without  using third variable : using ^ xor operator
	x=x^y;  // 15---->1111
	y=x^y; //  10---->1010
	x=x^y ;//   5---->0101

	
	
	System.out.println(x);
    System.out.println(y);

	}

}
