package week3.day2;

public class BMW extends Car {
	
	public void turnOnAc() {
		System.out.println("Ac is turned on----->bmw class");
	}
	public void voiceCommand() {
		System.out.println("voice command is enabled---->bmw class");
	}
	public static void main(String[] args) {
		BMW B=new BMW();
			
			B.turnOnAc();
			B.applyBrake();
		
	}

}
