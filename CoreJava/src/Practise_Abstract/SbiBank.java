package Practise_Abstract;

public class SbiBank extends AbstractBankclass{

	public static void main(String[] args) {
	AbstractBankclass ob =new SbiBank();
	ob.OpenAccount();
	ob.test1();
	ob.RateofInterest();

	}

	@Override
	public void RateofInterest() {
    System.out.println("Rate of interest of Sbi  is 4.5%");
	}

}
