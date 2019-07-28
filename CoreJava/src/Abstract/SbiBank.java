package Abstract;

public class SbiBank extends AbstractBankClass  {

	public static void main(String[] args) {
		SbiBank ob = new SbiBank();
		ob.test1();
		ob.OpenAccount();
		ob.RateOfInterest();
		

	}

	@Override
	public void RateOfInterest() {
		System.out.println("Rate of interest on SBI FD = 8.1%");
		
	}

}
