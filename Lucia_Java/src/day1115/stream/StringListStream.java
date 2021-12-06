package day1115.stream;

import java.util.*;
import java.util.stream.Stream;


public class StringListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s)); //정렬은 sorted
		
	
		
		
		
	}

}
