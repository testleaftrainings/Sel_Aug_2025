package week1.day2;

public class LearnMethod {
	
	//global varaibles
	
	//mtd sig:access modifier returntype mthd nme()
	
	public void add() {
		int a=5;//local varaibles
		int b=6;
		//System.out.println(a+b);
		int c=a+b;
		System.out.println(c);
		
		
		
	}
	public static void main(String[] args) {
		
		//syn:classname objectname=new classname();
		
		LearnMethod lm=new LearnMethod();
		lm.add();
		
		
	}

}
