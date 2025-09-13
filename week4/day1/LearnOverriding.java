package week4.day1;

public class LearnOverriding extends LearnOverloading{
	public void add() {
		int a=1;
		int b=4;
		System.out.println(a+b);
		super.add();
		
	}
	public static void main(String[] args) {
		/*
		 * LearnOverloading lo=new LearnOverloading(); lo.add()
		 */
		LearnOverriding lo1=new LearnOverriding();
		lo1.add();
		
	}

}
