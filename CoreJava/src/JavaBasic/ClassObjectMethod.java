package JavaBasic;

/*
 Class => It means generic term through which we can indicate group of people. eg human being , animal , vehicle.
 e.g. => Human being represents group of human object (Ram , sham , Shiv , gopal ,krishan)
 
 Object => Object  has property and behaviors 
 e.g. => Ram has property (height , weight and color) and behaviors (Walk ,eat , drink , talk and sleep) .
 
 Method => Action and behavior of object is method.
 e.g. => Walk , talk , sleep , drink ,eat etc
 
 Variable => properties of object is variable
 e.g. => height , weight and color etc
 
 */

public class ClassObjectMethod {
	
	// variables
	double height =5.7;
	int weight = 72;
	
	// methods
	public void walk() {
		System.out.println("Walking is good for health");
	}
	
	public void weight()
	{
		System.out.println("BMI index of weight must be maintained");
	}

	public static void main(String[] args) {

	// object is created of class	
	ClassObjectMethod   obj= new ClassObjectMethod ();
	
	// method can be called from object
	obj.walk();
	obj.weight();
	
	//  variable can only be called by 'syso print line'
	System.out.println(obj.weight);
	System.out.println(obj.height);

	}

}
