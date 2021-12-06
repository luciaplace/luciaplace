package day1111.collection;

public class Member implements Comparable<Member>{
	private int memberId; 
	private String memberName;
	
	public Member(int memberId, String memberName) {	
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "���� ���̵��" + memberId +"�Դϴ�.";
	}	
	//memberId�� ������ ���� ȸ����!!
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return memberId == m.memberId;
		}	
		return false;
	}
	@Override
	public int hashCode() {
		return memberId;
	}
	//������ ������ ���� ������ 0, ���������� �����̸� ����, ���ĸ� ����� ��ȯ
	@Override
	public int compareTo(Member o) {
		return memberId - o.getMemberId();
		
		/*
		 * if(memberId < o.getMemberId()) { return -1; }else if(memberId >
		 * o.getMemberId()) { return 1; }else { return 0; }
		 */
	}
	
}
