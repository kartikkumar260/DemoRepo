package Practise_Abstract;

public class IcicBank extends AbstractBankclass{

	public static void main(String[] args) {
	
		AbstractBankclass ob = new IcicBank();
		ob.test1();
		ob.OpenAccount();
		ob.RateofInterest();
	}

	@Override
	public void RateofInterest() {
	System.out.println("Rate od interest of IcIc bank is 4 %");
	}

}
