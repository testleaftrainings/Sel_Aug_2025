package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,3};
		int num1[]= {3,5,6,8,9};//3,5
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if (num[i]==num1[j]) {
					System.out.println("intersection is:"+num[i]);
					
				}
				
			}
			
		}
		
		

	}

}
