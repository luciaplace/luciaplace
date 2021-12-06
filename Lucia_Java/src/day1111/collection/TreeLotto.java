package day1111.collection;

import java.util.TreeSet;

public class TreeLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		for(; lotto.size() < 6; ) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
	}
}
