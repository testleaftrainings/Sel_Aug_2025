package week3.day2;

public class AXIS implements RBI {

	@Override
	public void knowYourCustomer() {
		System.out.println("pancard");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("10,000");
		
	}
	public void housingLoan() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		AXIS A=new AXIS();
		A.bankBalance();
	}

}
