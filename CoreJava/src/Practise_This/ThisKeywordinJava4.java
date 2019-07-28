package Practise_This;



public class ThisKeywordinJava4 {

int a =4;
int b =8;


//Rule => In case if we are not using this() keyword then at run time global value will override local value.
void test1(int a , int b) {
a=a;
b=b;
// global value of a and b are not assigned with local value. Hence at run time global value will override local value.
System.out.println("Local value of a and b ==>"+a+","+b);
System.out.println("Global value of a and b==>"+this.a+","+this.b);
}


// Rule => In case if we are using this() keyword then at run time local value will override global value.
void test2(int a , int b) {
this.a=a;
this.b=b;
//global value of a and b are assigned with local value. Hence in any case local value will only be displayed.
System.out.println("Local value of a and b ==>"+a+","+b);
System.out.println("Global value of a and b==>"+this.a+","+this.b);
}

// Rule= When naming of my local variable and global variable is not same.then as result local value will override global value.
void test3(int p , int q) {
a=p;
b=q;
//global value of a and b are assigned with local value. Hence in any case local value will only be displayed.
System.out.println("Local value of a and b ==>"+a+","+b);
System.out.println("Global value of a and b==>"+this.a+","+this.b);
}

void display() {
System.out.println("Actual value of a and b==>"+a+","+b);
}

public static void main(String[] args) {
	ThisKeywordinJava4 ob = new ThisKeywordinJava4();
	System.out.println("****Scenario without this() keyword*****");
	ob.test1(9, 21);
	ob.display();

	System.out.println("****Scenario with this() keyword*****");
	ob.test2(9,81);
	ob.display();

	System.out.println("****Scenario of prefering local variable without this keyword****");
	ob.test3(99,9999);
	ob.display();
}
}

