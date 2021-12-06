package day1109.ojbectex;

class Student{
	int studentId; //�й� : int 
	String name;//�̸� : name
	
	public Student(int studentId, String name){//������
		this.studentId = studentId;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//���� ��ü�� id���� �Ű������� �޾ƿ� ��ü�� id���� ������ true
			boolean b1 =  studentId == ((Student) obj).studentId;
			//�������� equals()�� ��
			boolean b2 = name.equals( ((Student) obj).name);
			return b1 && b2;
		}
		return false;// StudentŸ���� �ƴ� ��� �� �� �ʿ� ����. 
	}
	
	@Override
	public int hashCode() {
		return studentId + name.hashCode();
	}
	
	
	@Override
	public String toString() {
		return "Student [�й�=" + studentId + ", �̸�=" + name + "]";
	}
}
public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "�ڹ�Ŵ");
		Student s2 = new Student(1002, "�ڹ�ȫ");
		Student s3 = new Student(1001, "�ڹ�Ŵ");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		// == ������ ����� ��(�ּ�)�� ��
		if(s1 == s2) {
			System.out.println("s1�� s2�� ���� �л��Դϴ�.");
		}else {
			System.out.println("s1�� s2�� �ٸ� �л� �Դϴ�.");
		}
		if(s1 == s3) {
			System.out.println("s1�� s3�� ���� �л��Դϴ�.");
		}else {
			System.out.println("s1�� s3�� �ٸ� �л� �Դϴ�.");
		}
		//��ü�� �񱳽� equals()���
		if(s1.equals(s3)) {
			System.out.println("s1�� s3�� ���� �л��Դϴ�.");
		}else {
			System.out.println("s1�� s3�� �ٸ� �л� �Դϴ�.");
		}
		
		
	}

}
