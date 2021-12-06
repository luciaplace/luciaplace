package day1111.collection;

import java.util.*;

//Iterator : �÷����� ��Ҹ� �о���� ����� ǥ��ȭ�� �������̽�
//ListIterator
//Enumeration :Iterator�� ������
public class IteratorEx {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {//���� ��ü�� �ִ��� üũ
			System.out.println(iter.next()); // Ŀ���� ���� ��ü�� �Ѿ ��ü�� �����´�.
		}
	}

}
