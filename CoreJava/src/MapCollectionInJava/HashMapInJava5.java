package MapCollectionInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapInJava5 {

	public static void main(String[] args) {
	
	Map <String, List<String>> map = new HashMap<String , List<String>> ();
	
	// below creating list of email 
	List <String> listofEmails = new ArrayList<String> ();
	listofEmails.add("Test@gmail.com");
	listofEmails.add("Sample@gmail.com");
	listofEmails.add("Calculate@gmail.com");
	listofEmails.add("Sum@gmail.com");
	listofEmails.add("Output@gmail.com");
	

	
	map.put("First Email",listofEmails );
	
	
	
	System.out.println(map);

	}

}
