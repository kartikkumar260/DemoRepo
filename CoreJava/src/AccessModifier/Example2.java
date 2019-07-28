package AccessModifier;
/*
Accessing of modifier Example class through this class having Inheritance relationship .

Rule => Private method and variable cant be called in other class. Compile time error occurs.
*/
public class Example2 extends Example{

	public static void main(String[] args) {
		Example2 ob = new Example2();
	
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.d);
		
		ob.test1();
		ob.test2();
		ob.test4();
		
		
		Example ob1 = new Example();
		ob1.test1();
		ob1.test2();
		ob1.test4();
		
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.d);

		/*We cannot call private method and variable in other class  as compile time error occurs.
		System.out.println(ob.c);
		ob.test3();
		*/

	}

}
