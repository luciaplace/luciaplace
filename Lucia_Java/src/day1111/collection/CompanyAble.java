package day1111.collection;

import java.util.TreeSet;

public class CompanyAble {

	public static void main(String[] args) {
		Able a1 = new Able("B123",90,75,70); //객체 5개 생성
		Able a2 = new Able("T723",60,90,80);
		Able a3 = new Able("A427",85,80,80);
		Able a4 = new Able("G533",90,90,60);
		Able a5 = new Able("D352",85,80,80);
	
		TreeSet<Able> tree = new TreeSet<Able>(); //트리셋으로 생성한 객체 저장하기. 
		tree.add(a1);
		tree.add(a2);
		tree.add(a3);
		tree.add(a4);
		tree.add(a5);
	
		
		
		System.out.println(tree);

	}

}
