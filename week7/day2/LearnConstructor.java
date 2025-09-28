package week6.day2;

public class LearnConstructor {
	/**
	 * Constructor:
	 * -is used to initialize the state of the objects.
	 * -constructor name should be same as that of the class name
	 * -constructor will not have the return type as like method
	 * types:
	 * 1)default(no args)
	 * 2)parameterized(constructor overloading)
	 * -this keyword:used to differentiate local and global variable
	 * can you call one constructor from another constructor?
	 * yes,called as constructor chaining and this is achieved using this keyword.
	 */
	
	int empID;
	String empName;
	boolean empStatus;
	
	public LearnConstructor() {
		//this(76, "dhivya", true);
		System.out.println("default constructor");
		empID=65;
		
	}
	public LearnConstructor(int empID,String empName,boolean empStatus) {
		this();
		System.out.println("parameterized constructor");
		this.empID=empID;
		this.empName=empName;
		this.empStatus=empStatus;
		
		
	}
	
	public static void main(String[] args) {
		
		
		  LearnConstructor lc1=new LearnConstructor(87, "saran", true);
		  System.out.println(lc1.empID+" "+lc1.empName+" "+lc1.empStatus);
		 
		
		/*
		 * LearnConstructor lc=new LearnConstructor();
		 * System.out.println(lc.empID+" "+lc.empName+" "+lc.empStatus);
		 */
		
	}

}
