package MapCollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava3 {

	
	public static void main(String[] args) {
		HashMap<Integer , String> A = new HashMap<Integer , String>();
		A.put(50 ,"500");
		A.put(60 ,"600");
		A.put(70 ,"700");
		A.put(80 ,"800");
		A.put(90 ,"900");
		A.put(10 ,"1000");
		
		System.out.println(A);

		System.out.println("******************Scenario of fetching hash key and hash value****************");
		
		for (Map.Entry<Integer, String>  e : A.entrySet()){
			
			System.out.println(e.getKey()+"*********"+e.getValue() );
			
		}
	}

}
