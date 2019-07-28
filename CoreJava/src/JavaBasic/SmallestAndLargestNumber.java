package JavaBasic;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

	int num[] = {-10 ,24 ,9 ,279,-99,43355,-345};
	
	int large =num[0];
	int small =num[0];
			
	for(int i =0 ; i<num.length ;i++) {
		
	if (num[i]>large) 
	{
	large=num[i];
	}
	else if (num[i]<small)
	{
	small =num[i];
	}
	}
	System.out.println("Given array is "+Arrays.toString(num));
	System.out.println("Smallest number ==> "+small);
	System.out.println("Largest number ==> "+large);
	}

}
