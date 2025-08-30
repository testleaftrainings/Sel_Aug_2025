package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/**
		 * Strings are sequence of characters
		 * -immutable class
		 * -non primitive datatype
		 * -two implementations:
		 *  a)String literals:syn:datatype var.name="values"
		 *  b)string instantiation
		 *  syn:datatype v.name=new d.t("values")
		 *  
		 */
		String str="Testleaf";//length from 1
		String str1="Test leaf";
		
		String name=new String("Testleaf");
		String name1=new String("TEsTLEAF");
		
		//count the no of chararcters
		int length = name.length();
		System.out.println(length);
		//compare the two strings(equals)--->compares the content of the string and is casesensitive
		boolean equals = str.equals(name1);//"Testleaf","Test leaf"
		System.out.println(equals);
		if (str.equals(name)) {
			System.out.println("same");
		} else {
			System.out.println("not same");

		}
		//==--->comparing the memory address
		if (str==str1) {
			System.out.println("same");//name=29,name1=30
			
		} else {
			System.out.println("not same");

		}
		//equals ignorecase
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
		System.out.println(equalsIgnoreCase );
		
		//tocharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		//charAt--->retrieve the value using index
		char charAt = name.charAt(5);
		System.out.println(charAt );
		
		//replace
		String s="Testleaf@321";
		String replace = s.replace("e", "").replace("l", "@");
		System.out.println(replace);
		//replace All
		String replaceAll = s.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = s.replaceAll("[^A-z]", "");
		System.out.println(replaceAll2);
		//string to integer
		String st="1234";
		System.out.println(st+10);
		int stringToInt = Integer.parseInt(st);
		System.out.println(stringToInt+10);
		//integer to string
		int num=123;
		System.out.println(123+10);
		String intToString = Integer.toString(num);
		System.out.println(intToString+10);
		//split---->crop the multiple strings
		String sp="Testleaf and qeagle";//Test--->0,af and qeag--->1
		String[] split = sp.split("le");
		//System.out.println(split[2]);
		String[] split2 = sp.split(" ");
		System.out.println(split2[1]);//0-->testleaf,1--->and,2-->qeagle
		String[] split3 = sp.split("");
		System.out.println(split3[5]);//0--t,1-->e
		
		//substring
		String ss="August";
		String substring = ss.substring(1);
		System.out.println(substring);
		String substring2 = ss.substring(2, 5);
		System.out.println(substring2);
		
		
		
		
		
		

	}

}
