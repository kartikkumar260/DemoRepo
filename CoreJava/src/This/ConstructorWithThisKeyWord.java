package This;

public class ConstructorWithThisKeyWord {

	static int age;
	String name;
	String dept1;
	
	public ConstructorWithThisKeyWord(String name, int age) {		
		this.name= name;
		ConstructorWithThisKeyWord.age= age;
		
		System.out.println("Name is:"+ name +"Age is:" + age);
	}
	
	public ConstructorWithThisKeyWord(String name, int age, String dept) {		
		this.name= name;
		ConstructorWithThisKeyWord.age= age;
		dept1=dept;
		
		System.out.println("Name is:"+ name +" Age is:" + age + " Dept is:" + dept);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyWord cf1 = new ConstructorWithThisKeyWord("Peter", 30 , "Dev");
		ConstructorWithThisKeyWord cf = new ConstructorWithThisKeyWord("Tom", 20 );
		
		cf.test();  //both will print 30 as global variable age will take latest value
		cf1.test(); 
	}
	
	public void test() {
		
	  System.out.println(age);
	  System.out.println(dept1);
	}

}


