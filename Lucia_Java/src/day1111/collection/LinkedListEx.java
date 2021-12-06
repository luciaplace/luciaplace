package day1111.collection;

import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long start;// nano������ �ð���
		long end;

		start = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			list1.add(0,"a");
		}
		end = System.nanoTime();

		System.out.println("ArrayList �ɸ� �ð�  : " + (end - start));

		start = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			list2.add(0,"a");
		}
		end = System.nanoTime();

		System.out.println("LinkedList �ɸ� �ð� : " + (end - start));

	}

}
