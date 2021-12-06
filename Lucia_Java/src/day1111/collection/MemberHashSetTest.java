package day1111.collection;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberSet = new MemberHashSet();
		
		Member m1 = new Member(1001, "�ڹ�Ŵ");
		Member m2 = new Member(1002, "�չα�");
		Member m3 = new Member(1003, "ȫ�浿");
		Member m4 = new Member(1001, "�ڹ�Ŵ");
		
		memberSet.addMember(m1);
		memberSet.addMember(m2);
		memberSet.addMember(m3);
		memberSet.addMember(m4);
		
		memberSet.showAllMember();
		

	}

}
