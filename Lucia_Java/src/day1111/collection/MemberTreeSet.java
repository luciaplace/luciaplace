package day1111.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> tree;
	
	public MemberTreeSet() {
		tree = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		tree.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> iter = tree.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			if(memberId == m.getMemberId()) {
				tree.remove(m);
				return true;
			}
		}
		System.out.println("�´� ���̵� ����");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : tree) {
			System.out.println(m);
		}
		System.out.println();
	}
}
