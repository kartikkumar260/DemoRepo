package Abstract;

public class IcicBank extends AbstractBankClass {

	public static void main(String[] args) {
		IcicBank ob = new IcicBank();
		ob.OpenAccount();
		ob.test1();
		ob.RateOfInterest();

	}

	@Override
	public void RateOfInterest() {
	System.out.println("Rate of interest on FD for ICIC bank = 7.9%");
		
	}

}
