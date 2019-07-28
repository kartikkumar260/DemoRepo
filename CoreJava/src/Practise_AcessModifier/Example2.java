package Practise_AcessModifier;
/*
Accessing of modifier of above class through different class having no Inheritance relationship .

Rule => Private method and variable can't be called in other class. Compile time error occurs.
*/

public class Example2 {

	public static void main(String[] args) {
	
		Example1 ob =new Example1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.d);
		
		ob.test1();
		ob.test2();
		ob.test4();
		
		/*We cannot call private method and variable in other class  as compile time error occurs.
		System.out.println(ob.c);
		ob.test3();
		*/
		
	}

}
