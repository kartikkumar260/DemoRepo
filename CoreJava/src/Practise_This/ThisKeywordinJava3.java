package Practise_This;

// Rule = By default global variable is given preference over local variable.
// Rule = Using this() keyword local variable is given preference over global variable.
// Rule= When naming of my local variable and global variable is not same.then as result local value will override global value.

public class ThisKeywordinJava3 {

// Global variable
	
int a =7 ;
int b=21;

//Rule=Without this keyword global variable is preferred over local variable. see below method
void test (int a , int b) // local variable
{
a=a;
b=b;
}

//Rule= Using this() keyword local variable is given preference over global variable.
void test1  (int a , int b) 
{
this.a=a;
this.b=b;
}

/*
 Scenario : Example when we will not use this keyword.  But still my code will work.
 * Solution =>  When naming of my local variable and global variable is not same.
  Note => If name of global and local variable is same then then we have to use This() keyword to diplay local variable
 */

//Rule= When naming of my local variable and global variable is not same.then as result local value will override global value.
void test2(int p ,int q)
{
a=p;
b=q;
	
}

void display() {
System.out.println("value of a and b=="+a+";"+b);
}

public static void main(String[] args) {
ThisKeywordinJava3 ob = new ThisKeywordinJava3();
	System.out.println("****Scenario without this() keyword*****");
		// define local variable
		ob.test(9, 81);
		ob.display();
		
		System.out.println("****Scenario with this() keyword*****");
		ob.test1(9,81);
		ob.display();

		System.out.println("****Scenario of prefering local variable without this keyword****");
		ob.test2(99,9999);
		ob.display();
	}

}
