package Abstract;
/*
 Access modifier rules mentioned below
 
 Rule 1 => But we can increase access of any member of parent class. Eg public from default is allowed.
 Rule 2=>  We cannot decrease access of any member of parent class. Eg private from default is not allowed.
 */


public class TestAbstractClass1 extends AbstractClass{
	@Override
	
	void test2() //  By default this method has "Default" access modifier.
	{
	}
	/*
	Rule 1 => But we can increase access of any member of parent class. Eg public from default is allowed.
	
	public void test2() // it is completely allowed
	{  
	}
	
	 
	Rule 2 =>   We cannot decrease access of any member of parent class. Eg private from default is not allowed. 
	if we do so then compile time error is displayed.
	 
	private void test2() \\ compile time error is displayed.
	  {
	}
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
