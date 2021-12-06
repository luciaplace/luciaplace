package day1115.lambda;

import java.util.*;
public class RamdaCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.replaceAll(i -> i+"A"); //apply 메서드 구현. 
		
		System.out.println(list);
		
	}

}
