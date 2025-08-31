package week3.day2;

public class ICICI extends HDFC{

	@Override
	public void knowYourCustomer() {
		System.out.println("aadhar1");
		
	}

	@Override
	public void bankBalance() {
		
		System.out.println("10000");
	}

	@Override
	public void convertCurrency() {
		System.out.println("in dollars");
		
	}
	public static void main(String[] args) {
		ICICI ic=new ICICI();
		ic.knowYourCustomer();
	}

}
