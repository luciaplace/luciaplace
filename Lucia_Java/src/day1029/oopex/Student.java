package day1029.oopex;
//실행할 클래스가 아니고 객체를 생성할 클래스(main없음)
public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	void showStudentInfo() {
		System.out.println(studentName+" , "+address);
	}
	
	
}