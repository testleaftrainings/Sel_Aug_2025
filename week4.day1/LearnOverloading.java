package week4.day1;

public class LearnOverloading {
	/**
	 * overloading:
	 * having two or moremethods in the class,having same signature but different i/p args
	 * -static/compile/early binding
	 */
	public void add() {
		int a=10;
		int b=4;
		System.out.println(a+b);
	}
	public void add(int a,int b,float c) {
		System.out.println(a+b+c);
	}
	public void add(int a,float c,int b) {
		System.out.println(a+b-c);
	}
	public static void main(String[] args) {
		LearnOverloading l=new LearnOverloading();
		l.add();
		l.add(1, 2, 3.3f);
	}

}
