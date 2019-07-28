package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
	
	int [] i = new int [7];
	i[0]= 10;
	i[1]= 11;
	i[2]= 12;
	i[3]= 13;
	i[4]= 14;
	i[5]= 15;
	i[6]= 16;

	System.out.println("Length of i[] array==>   "+i.length);
	System.out.println("Value of i[] array on 4 th index==>      "+i[4]);
	System.out.println("Value of i[] array on 1 st index==>      "+i[1]);
	
	System.out.println("**********Using for loop ascending order of all values are array list************");
	
	for(int j=0; j<=i.length; j++) {
		System.out.println(j);
	}

	System.out.println("**********Using for loop decending order of all values of array list ************");
	
	for (int k=i.length ; k>=0 ;k-- ) {
    System.out.println(k);
}
}}