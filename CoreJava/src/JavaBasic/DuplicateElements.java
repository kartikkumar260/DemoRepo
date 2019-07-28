package JavaBasic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
	
	String name[] = {"Java" ,"Python" , "Ruby" ,"C#", "Java script", "Python" ,"Ruby"};
	
	System.out.println("**************Using for loop scenario  **********");
	// Compare each element :0 (n*n) -- worst solution 
	for(int i=0 ; i<name.length;i++)
	{
	for(int j=i+1 ; j<name.length;j++) // initialize (int j = i+1;)
	{
	if(name[i].equals(name[j])) {
		System.out.println("Duplicate element ==>  "+name[i]);
	}
	}
	}
	System.out.println("**************Using Hashset it store unique value*******");
	// Rule => In below store object we can store unique value.
	Set<String> store = new HashSet<String>();
	
	for(String x :name) 
	{
	if(store.add(x)==false)	// If we are string a unique value in store object its right. However in False case if we try to add duplicate value
	{
	System.out.println("Duplicate element ==> "+x);	
	}
	}
	
	}

}
