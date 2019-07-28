package Practise_This;

//Rule => The scope of these local variable will only be limited to main() method.
//Rule => We must create object of class to access global variable and non static method()
public class LocalvsGlobalVariable {

// Global variable and class variable
String name = "Tom";
int age = 25;
int i= 50;
int j=75;

public void sum() {
// local variable  i and j
// Rule => The scope of these local variable will only be limited to sum() method.
int i = 11;
int j= 22;
int age=33;
System.out.println("Inside sum() local value of i==>  "+i);
System.out.println("Inside sum() local value of j==>  "+j);
System.out.println("Inside sum() local value of age==>  "+age);
}



public static void main(String[] args) {
// local variable i and j .
// Rule => The scope of these local variable will only be limited to main() method.
// Rule => Inside method we must call local variables directly.
	
System.out.println("****Rule 1 ==> Inside method we must call local variables directly.*****************");
int i= 10;
int j= 20;
int age = 30;

System.out.println("Inside main() local value of i==>    "+i);
System.out.println("Inside main() local value of j==>    "+j);
System.out.println("Inside main() local value of age==>   "+age);

//Rule  => We must create object of class to access global variable and non static method()
LocalvsGlobalVariable ob = new LocalvsGlobalVariable();
System.out.println("******Rule 2 ==> We must create object of class to access Non static method******");
ob.sum();
	
System.out.println("******Rule 3 ==> We must create object of class to access Global variable******");
System.out.println("Global variable value of  i ==>  "+ob.i);
System.out.println("Global variable value of  j ==>  "+ob.j);
System.out.println("Global variable value of age ==>  "+ob.age);
}}
