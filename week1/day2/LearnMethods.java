package week1.day2;

public class LearnMethods {
	//Accessmodifier returntype mthdname(parameters)
	
	public void addNumbers(int a,int b,float c){
		System.out.println(a+b+c);
		
	}
	
	private int noOfBicycles(){
		return 2;
		
	}
	
	String bicycleData(String brandName,String brandColour){
		return brandName+" "+brandColour;
		
	}
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addNumbers(4, 7, 9.9f);
		int number = lm1.noOfBicycles();//ctrl+2,L(assign a local varaible)
		System.out.println(number);
		
		System.out.println(lm1.bicycleData("Honda", "white"));
	}

}
