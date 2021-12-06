package day1111.collection;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		int[] point = { 60 , 13, 24, 100, 54, 87, 74 };

		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i : point) {
			tree.add(i);
		}

		System.out.println(tree);
		System.out.println(tree.headSet(50));
		System.out.println(tree.tailSet(50));
		

	}

}
