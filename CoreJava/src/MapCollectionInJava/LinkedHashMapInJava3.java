package MapCollectionInJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInJava3 {

	public static void main(String[] args) {
		LinkedHashMap<Integer ,String> A = new LinkedHashMap<Integer , String>();
		A.put(50,"500");
		A.put(60,"600");
		A.put(70,"700");
		A.put(80,"800");
		A.put(90,"900");
		A.put(100,"1000");
		A.put(110,"1100");

		 System.out.println("A linkedHash record are always displayed in insertion order===>   "+A);
		 System.out.println("Size of B linkedHashMap===>   "+A.size());
		 
		 System.out.println("******************Scenario of fetching hash key and hash value****************");
		 for(Map.Entry<Integer ,String> e  :  A.entrySet()){
			 System.out.println(e.getKey()+"*************"+e.getValue());
		 }

	}

}
