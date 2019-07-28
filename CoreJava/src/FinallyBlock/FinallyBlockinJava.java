package FinallyBlock;
/*
=>	Finally, block is used to execute very important piece of code.
=>	The code that we always want to execute. We can’t miss that code.
=>	Irrespective anything that  happen to program finally block will get execute.
Note => this mainly used when we want to stop database or JDBC connection then we can write in finally block.

 */
public class FinallyBlockinJava {

	
	public void test1() {
		try {
			
		}catch(Exception e){
			
		} finally // finally block will always be executed
		{
			System.out.println("I am from Finally block in java");
		}
	}
	public static void main(String[] args) {
		FinallyBlockinJava ob = new FinallyBlockinJava();
		ob.test1();

	}

}
