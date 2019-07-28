package Interface;
/*
 * Rules to remember
1)	It is mechanisms to  get 100 % abstractions.
2)	Interface methods are by default ‘Public’.
3)	Interface method must be unimplemented. We cannot write implemented method inside interface. If we try to write method body then we get compile time error.
4)	Interface variable are by default ‘Public static final’.
5)	We need to initialize all declared variable in Interface. Interface variable we must be initialized . Eg  int i =99 or Public static final int i= 99;
6)	Through interface we can achieve multiple inheritance.
7)	whenever any class implement any interface then we have to write implementation of all the method. We cant skip a single method.
8)	We cannot create object of interface.
9)	We can only create reference of interface.

 */
public interface InterfaceExample {

	/* Rule =If we do not initialized variable in interface then as result compile time error is displayed. Hence commenting it.
	int i;
	public  Static final int j;
	 */
	
	int i =9;
	public static final int j =99;
	
	/*
	 * Rule = If we try to write implementation in method of interface then as result compile time error is displayed. Hence commenting it.
	 * 
	 * public void test{
	  
	 }
	 */
	
	public void test1() ;
	
	public void test2() ;
	
	
	public void test3() ;
	
	public void test4() ;
	
	
	
}
