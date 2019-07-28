package WrapperClass;
/*
 Wrapper classes are those classes , Which are used to ‘wrap’ primitive variable in such a way that they behave like object.
1.	Integer :- for wrapping int variable.
2.	Character :-for wrapping char variable.
3.	Boolean :- for wrapping Boolean variable.
4.	Long :- For wrapping long value.
5.	Float :- for wrapping float value.
6.	Double :- for wrapping double value.

 */
public class WrapperClass {

	public static void main(String[] args) {
    
	String x ="100";
	System.out.println(x+21);
	
	// data conversion: String into integer
	int i =Integer.parseInt(x);
	System.out.println(i+21);
	
	// data conversion : String into double
	String y="12.12";
	double j=Double.parseDouble(y);
	System.out.println(j+21.21);
	
	
	// data conversion : String into boolean 
	String z ="true";
	Boolean k =Boolean.parseBoolean(z);
	System.out.println(k);
	
	
	// data conversion : Int to String 
	
	int a = 200;
	System.out.println(a+901);
	String a1 =String.valueOf(a);  // ai "200"
	System.out.println(a1+1000);
	}
	/*
	 Scenario ==> 
	 String  b = "100A"; // In valid string hence it will give run time exception if we try to execute it .
	 int b1 = Integer.parseInt(b);
	 System.out.println(b1);
	  
	 */
	 }
