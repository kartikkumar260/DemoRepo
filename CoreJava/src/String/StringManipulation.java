package String;

public class StringManipulation {

	public static void main(String[] args) {

		String x ="The rains have started here suns city" ;
		String y ="The RAINS have started here suns city" ;
		
		System.out.println(x.length());
		System.out.println(x.charAt(5));
		//1st occurrence of s
		System.out.println("First 's' in string==>  "+x.indexOf('s')); 
		
		// 2nd occurrence of s . 1st s is index is 8. However size is 9. Hence we have to add 1 in below statement.
		System.out.println("Second 's' in string==>  "+x.indexOf('s' ,x.indexOf('s')+1));
		
		// third occurrence of  s in string x
		
		System.out.println("third 's' in string==>  "+x.indexOf('s',x.indexOf('s' ,x.indexOf('s')+1)+1));
		// fourth occurrence of s in string s
		
		System.out.println("Fourth 's' in string==>  "+x.indexOf('s',x.indexOf('s',x.indexOf('s' ,x.indexOf('s')+1)+1)+1));
		
		// we can search index of substring that exist in string 
		System.out.println("index of valid substring in string==> "+x.indexOf("suns"));
		
		/*
		 *  Rule=> If we try to find index of substring that does not exist .In that case output is  -1.
		 *  Practical implementation=> in automation this method is very useful if we try to find any label that exist on page.
		 *                           If it return -1 than it does not exist.
		 */
		
		System.out.println("index of Invalid substring in string==> "+x.indexOf("Hello"));  // -1 is 
		
		// using substring method we can fetch required substring. eg x.substring(starting index , ending index).
		System.out.println("Fetch required substring from main string==>  "+x.substring(4, 9));
		
		// string comparison using equals method . It is case sensitive 
		System.out.println(x.equals(y));
		
		// string comparison using EqualIgnoreCase method
		System.out.println(x.equalsIgnoreCase(y));
		
				
		
		
	}

}
