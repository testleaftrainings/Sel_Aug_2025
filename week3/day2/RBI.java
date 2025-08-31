package week3.day2;

public interface RBI {
	/**
	 * -100% abstraction method-till 1.7 version
	 * -blueprint of class
	 * -objects cannot be created 
	 */
	public default void withDrawalLimit() {
		System.out.println("rs-100");
		
	}
	public void knowYourCustomer();
	public void bankBalance();

}
