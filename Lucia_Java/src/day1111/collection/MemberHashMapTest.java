package day1111.collection;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberMap = new MemberHashMap();
		
		Member m1 = new Member(1001, "�ڹ�Ŵ");
		Member m2 = new Member(1002, "�չα�");
		Member m3 = new Member(1003, "ȫ�浿");
		Member m4 = new Member(1004, "���ڹ�");

		memberMap.addMember(m1);
		memberMap.addMember(m2);
		memberMap.addMember(m3);
		memberMap.addMember(m4);
		
		memberMap.showAllMember();
		
		memberMap.removeMember(1004);
		memberMap.showAllMember();
		
		
	}

}
