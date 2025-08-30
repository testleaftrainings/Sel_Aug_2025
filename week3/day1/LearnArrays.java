package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		/**
		 * Arrays:
		 * -collection of items of similar dattype
		 * -implementation:
		 *  a)ArrayLiteral-->Based on data-->syn:Datatype v.name[]={values};
		 *  b)Array instantiation--->Based on size--->syn:D.type v.name[]=new D.type[size]
		 */
		
		//Array literal
		int marks[]= {89,78,98,90,67};
		//length 
		int arrLength = marks.length;
		System.out.println(arrLength);
		//iterate the values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		//sorting an array
		Arrays.sort(marks);//67,78,89,90,98
		System.out.println(marks[3]);
		//print the value at the last index
		System.out.println(marks[arrLength-1]);
		
		//Array instantiation:
		int marks1[]=new int[7];
		marks1[0]=78;
		marks1[1]=67;
		marks1[2]=89;
		marks1[3]=45;
		marks1[4]=90;
		System.out.println(marks1[4]);
		//System.out.println(marks1[7]);
		String learners[]=new String[5];//1,2,3
		learners[0]="syed";
		learners[1]="harini";
		learners[2]="shruthi";
		learners[3]="sakthivel";
		System.out.println(learners[4]);
		
		

	}

}
