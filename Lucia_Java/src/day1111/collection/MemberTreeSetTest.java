package day1111.collection;

public class MemberTreeSetTest {
	public static void main(String[] args) {

		MemberTreeSet treeSet = new MemberTreeSet();
		
		Member m1 = new Member(1001, "�ڹ�Ŵ");
		Member m2 = new Member(1002, "�չα�");
		Member m3 = new Member(1003, "ȫ�浿");
		
		treeSet.addMember(m3);
		treeSet.addMember(m2);
		treeSet.addMember(m1);
		
		treeSet.showAllMember();
		
	}
}
