package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUnique {

	public static void main(String[] args) {
		String name="saranya";//sarny
		char[] charArray = name.toCharArray();
		
		//create a set
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		
		
		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);
			if (!b) {
				duplicate.add(charArray[i]);
			}
			
		}
		System.out.println("unique are:"+unique);
		System.out.println(duplicate);
	}

}
