package week3.day2;

public class SBI extends AXIS implements RBI,Inter{

	@Override
	public void knowYourCustomer() {
		System.out.println("aadhar");
		
		
	}

	@Override
	public void bankBalance() {
		System.out.println("25,000");
		
		
	}
	public static void main(String[] args) {
		SBI S= new SBI();
		S.bankBalance();
		S.withDrawalLimit();
		S.housingLoan();
		
	}

	@Override
	public void systemDesign() {
		System.out.println("design is in process");
		
	}

}
