package Practise_This;
/*
 * Few points of this
=>	This is used to differentiate between local variable and global variable.
=>	This is used to call current class constructor 
=>	This can be used as method argument. This refer to current class
=>	Using this we can call non static member
=>	This will be available for non static member.
=>	In Non static method using This() we can call static variable.
=>  But inside Static method we cannot use this() keyword as compile time error is displayed.

 */
public class ThisKeywordinJava1 {
	
int a ,b , c;

public ThisKeywordinJava1() {
System.out.println("I am from default constructor <ThisKeywordinJava(int a )>");
}

public ThisKeywordinJava1(int a , int b) {
this(); // this is used to call current class constructor (ThisKeywordinJava() ).
System.out.println("I am from Parameterized integer constructor <ThisKeywordinJava(int a , int b)>");
this.a=a;
this.b=b;
}

public ThisKeywordinJava1(int a , int b , int c) {
this(a,b);  // this will call parameterized two integer constructor (ThisKeywordinJava(int a , int b))
System.out.println("I am from Parameterized integer constructor <ThisKeywordinJava(int a , int b , int c)>");
this.c=c;
}

void display() {
System.out.println("value of a , b and c"+a+","+b+","+c);
}


public static void main(String[] args) {
	ThisKeywordinJava1 ob= new ThisKeywordinJava1(4 , 8 , 12);
	ob.display();
	}

}
