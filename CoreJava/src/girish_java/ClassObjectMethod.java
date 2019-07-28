package girish_java;

public class ClassObjectMethod {
   //variables
	double height =5.7;
	int weight =75;
	//methods
	public void	 walk()
	{
		
		System.out.println("walking");
			}
    public void weight()
    {
        	System.out.println("BMI index of weight must be maintained");
    }
		
	public static void main(String[] args) {
// object created	
		ClassObjectMethod  ob= new ClassObjectMethod();
	
		
	// calling method
		ob.walk();
		ob.weight();
		
		// calling variable
		System.out.println(ob.height);
        System.out.println(ob.weight);		
	}

}
