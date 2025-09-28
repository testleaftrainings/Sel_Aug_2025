package week6.day2;

public class LearnFinally {

	public static void main(String[] args) {
		int x=4;
		int y=0;
		
		try {
			System.out.println(x/y);
			
		} 
			  catch (Exception e) { System.out.println(e); }
			 
		
		finally {
			System.out.println("finally completed");
		}
		System.out.println("done");

	}

}
