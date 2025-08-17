package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		int marks=50;
		//shortcut for if--->type if and do ctrl+space
		
		if (marks>=40) {
			System.out.println("pass");
		}
		
		if (marks>60) {
			System.out.println("pass");
			
		} else {
			System.out.println("fail");

		}
		
		int marks1=70;
		if(marks1==60) {
			System.out.println("pass");
			
		}else if(marks1<45) {
			System.out.println("fail");
			
		}
		else if(marks1>80) {
			System.out.println("distinction");
			
		}
		else {
			System.out.println("out of range");
		}

	}

}
