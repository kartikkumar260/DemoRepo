package AccessModifier;
/*
 * 
Class can having access modifier (public , protected ,private and default)

General Scenario of Same class
Within same class we can access all Access modifier (Public , Protected , Private and Default). 
In same class there is no restriction Because these are member of class.
Method and variable are member of class.
 */

public class Example {

public int a;
protected int b;
private int c;
int d; // default variable

public void test1() {
	System.out.println("I belong to method test1() of public access modifier");
}

protected void test2() {
	System.out.println("I belong to method test2() of protected access modifier");
}

private void test3() {
	System.out.println("I belong to method test3() of private access modifier");
}

void test4() // default method
{
	System.out.println("I belong to methid test4() of default access modifier");
}

	public static void main(String[] args) {
	
		Example ob = new Example();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();

	}

}
