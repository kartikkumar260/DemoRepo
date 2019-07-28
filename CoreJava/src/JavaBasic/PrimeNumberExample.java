package JavaBasic;

public class PrimeNumberExample {

	public static void main(String[] args) {
	
	int a= 125;	
		
	for(int i=2;i<=a;i++) 
	{
	for (int j=2;j<=i;j++) 
	{		
    if(j==i) 
    {
    System.out.println(i);	
    }
    if (i%j == 0) 
    {
    	break;
    }
	  }
	}
	}
}
