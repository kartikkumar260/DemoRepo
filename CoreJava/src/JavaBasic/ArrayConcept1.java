package JavaBasic;

public class ArrayConcept1 {

	public static void main(String[] args) {
	// double Array
		
	double a[] = new double[5];
	a[0] = 0.9;
	a[1] = 1.8;
	a[2] = 2.7;
	a[3] = 3.6;
	a[4] = 4.5;
	System.out.println("Double array 5th index value =="+a[4]);
	System.out.println("Double array size =="+a.length);
	
	// char array
	
	char c[] = new char[3];
	c[0]= 'y';
	c[1]= 'e';
	c[2]= 's';
	System.out.println("char array 2th index value =="+c[2]);
	System.out.println("char array size =="+c.length);
	
	// boolean array
	
	boolean d[] = new boolean[2];
	d[0]=false;
	d[1]= true;
	System.out.println("boolean array 2th index value =="+d[1]);
	System.out.println("boolean array size =="+d.length);

	// String array
	
	String s[] = new String[5];
	s[0] = "Hello";
	s[1] = "World";
	s[2] = "2.7";
	s[3] = "4.7";
	s[4] = "9";
	System.out.println("String array 2th index value =="+s[1]);
	System.out.println("String array size =="+s.length);
	
	// Object array (Object is superclass in java)
	// we can pass any type of argument in object array.
	Object ob[] = new Object[5];
	ob[0]="Hi";
	ob[0]='I';
	ob[0]=2.7;
	ob[0]=9;
	ob[0]=true;
	System.out.println("Object array 4th index value=="+ob[2]);
	System.out.println("Object array size =="+ob.length);
	
	}

}
