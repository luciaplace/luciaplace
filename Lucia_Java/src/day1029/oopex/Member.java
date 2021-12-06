package day1029.oopex;

public class Member {
	String name;
	String id;
	String password;
	int age;
	//로그인 - 리턴타입 : boolean	이름 : login	매개변수 :아이디, 패스워드
	// == : 주소값 비교. equals() : 문자열의 내용 비교
	boolean login(String i, String p) {
		return id.equals(i) && password.equals(p);
	}
	//로그아웃 - 리턴타입 : void	이름 : logout	매개변수 :아이디
	void logout(String i) {
		System.out.println(i+"님이 로그아웃되었습니다.");
	}
	
}
