package week1.day2;

public class LearnBreak {

	public static void main(String[] args) {
		//stops the entire iteration
		
		for (int i = 1; i <= 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}

	}

}
