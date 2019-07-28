package JavaBasic;
/*
 * Armstrong number = 153 
 * 1*1*1=1
 * 5*5*5=125
 * 3*3*3=27
 * total sum=153.
 */
public class ArmstrongNumber {

	
	public static void Armstronge(int num) {
	System.out.println("Given number is == >  "+num);
	
	int reminder =0;
	int cube=0;
	int temp=0;
	
	temp=num;
	while(num>0) {
		
	reminder= num%10; // taking reminder
	num=num/10;
	cube=cube+(reminder*reminder*reminder);
	}
	
	if(temp==cube) //comparing temp with cube(Armstronge number )
	{
		System.out.println("This is required Armstrong number");
	} else {
		System.out.println("Not a armstrong number");
	}
	
	
	}
	public static void main(String[] args) {
		Armstronge(123);
		Armstronge(153);
	}

}
