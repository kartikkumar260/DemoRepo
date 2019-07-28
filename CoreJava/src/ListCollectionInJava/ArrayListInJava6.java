package ListCollectionInJava;

/*
 Scenario => If we only want to print value of "test" using iterator.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava6 {

	public static void main(String[] args) {
		ArrayList A = new ArrayList<>();
		A.add(9);
		A.add(9.9);
		A.add(true);
		A.add('r');
		A.add("Test");
		A.add(9.9);
		A.add(false);
		

		ArrayList<String> B = new ArrayList<String>();
        B.add("Hi");
        B.add("Hello");
        B.add("Bole");
        B.add("Welcome");
        B.add("Home");
        B.add("Sweet home");
		
	
		Iterator itr = A.iterator();
		
		while (itr.hasNext()) {
			
		if (itr.next().equals(9.9)) {
			System.out.println(itr.next()); // 
			
			System.out.println(itr);
		}
		}
		
		Iterator<String> itr1 = B.iterator();
		while (itr1.hasNext()) {
			if(itr1.next().equals("Home")) {
				System.out.println(itr1);
			}
		}

	}

}
