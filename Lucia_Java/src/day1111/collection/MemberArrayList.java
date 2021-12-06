package day1111.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> list;
	
	public MemberArrayList() {
		list = new ArrayList<>();
	}
	public void addMember(Member member) {
		list.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = list.iterator();
		while(ir.hasNext()) {
			Member m = ir.next();
			if(memberId == m.getMemberId()) {
				list.remove(m);
				return true;
			}	
		}
		System.out.println("�´� ���̵� ����");
		return false;
	}
	public void showAllMember() {
		Iterator<Member> ir = list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println();
	}
}







