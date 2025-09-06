package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/**
		 * List:
		 * -interface,objects cannot be created,so need an implementation class
		 * -ArrayList-imp.class
		 * -is an ordered collection
		 * -allows the duplicate values
		 * syn:
		 * interface <Generic> listname=new imp.class<generic>();
		 */
		
		List<String> learners=new ArrayList<String>();
		List<String> trainer=new ArrayList<String>();
		trainer.add("saranya");
		System.out.println(trainer);
		//add the items in the list
		learners.add("gopi");//index from0
		learners.add("shruthi");
		learners.add("harini");
		learners.add(1, "syed");
		learners.add(3, "hemalatha");
		learners.add("gopi");
		System.out.println(learners);
		
		//size of the list
		int size = learners.size();
		System.out.println(size);
		
		//retreive any particular item from the list
		String singleLearner = learners.get(2);
		System.out.println(singleLearner);
		
		//remove an item from the list
		String remove = learners.remove(4);
		System.out.println(remove);
		boolean remove2 = learners.remove("syed");
		System.out.println(remove2);
		System.out.println(learners);
		//clear
		//learners.clear();
		System.out.println(learners);
		trainer.addAll(learners);
		System.out.println(trainer);

	}

}
