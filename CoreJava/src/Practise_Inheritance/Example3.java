package Practise_Inheritance;

public class Example3 {

public int a = 5;
protected int b = 10;
// Rule =>private member of parent class cannot be inherit into child class.
private int c = 15;
int d = 20;
static int e = 25;
final int f =30;	
	
	
public void test1() {
System.out.println("Parent class Example1 having public method test1()");
}

protected void test2() {
System.out.println("Parent class Example1 having protected method test2()");
}

private void test3() {
System.out.println("Parent class Example1 having private method test3()");
}

void test4() {
System.out.println("Parent class Example1 having default method test4()");
}

public static void test5() {
System.out.println("Parent class Example1 having Static method test5()");
}

public final void test6() {
System.out.println("Parent class Example1 having Final method test6()");
}
}

