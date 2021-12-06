package day1111.collection;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();

		Member m1 = new Member(1001, "�ڹ�Ŵ");
		Member m2 = new Member(1002, "�չα�");
		Member m3 = new Member(1003, "ȫ�浿");
		Member m4 = new Member(1004, "��浿");

		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);
		
		memberList.showAllMember();
		
		memberList.removeMember(1002);
		memberList.removeMember(1002);
		
		memberList.showAllMember();
		
		
	}

}
