package Practise_AcessModifier;
/*
Accessing of modifier Example class through this class having Inheritance relationship .

Rule => Private method and variable cant be called in other class. Compile time error occurs.
*/
public class Example3  extends Example1{

	public static void main(String[] args) {


		System.out.println("**reference and object of child class**");
		Example3 ob= new Example3();
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
		
		
		System.out.println("**reference parent class and object of child class**");
		
		/*We cannot call private method and variable in other class  as compile time error occurs.
		System.out.println(ob.c);
		ob.test3();
		*/
		Example1 ob1= new Example3();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.d);
		
		ob1.test1();
		ob1.test2();
		ob1.test4();
	}

	

}
