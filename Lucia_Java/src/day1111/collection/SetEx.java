package day1111.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		String[] array = {"1",new String("1"),"2","3","3","3","4"};
		
		Set<String> set = new HashSet<String>();
		for(String s : array) {
			set.add(s);
		}
		System.out.println(set);
		
	}

}
