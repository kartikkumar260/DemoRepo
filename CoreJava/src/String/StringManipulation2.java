package String;

public class StringManipulation2 {

	public static void main(String[] args) {
	String str = "       Hello World of joy happiness   ";
	
	System.out.println(str.trim());
	
	System.out.println(str.replace("  ", ""));
	
	String date ="20-5-2018" ; // output 20/5/2018
	
	System.out.println(date.replace('-', '/'));
	
	// Split method
	System.out.println("**************Scenario 1 of split**************");
	String str2="Hello_World_of_joy_happiness";
	
	String a[]=str2.split("_");
	
	for(int i=0; i<a.length ; i++) {
		System.out.println(a[i]);
	}
	System.out.println("**************Scenario 2 of split**************");
	// Split method
	
	String str3="Hello  World  of  joy  happiness";
	
    String a1[] = str3.split("  ");
    
    for (int i=0 ; i<a1.length;i++) {
    	System.out.println(a1[i]);
    }
	
	System.out.println("**************Scenario of concat**************");
	String b ="Welcome";
	System.out.println(b.concat("Home"));
	

	}

}
