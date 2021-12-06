package day1029.oopex;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		Member m = new Member();// 한명의 회원 정보를 저장할 수 있는 객체
		m.name = "김자바";
		m.id = "javakim";
		m.password = "javakim";
		m.age = 20;
		
		Scanner s = new Scanner(System.in);
		System.out.print("아이디 입력 > ");
		String id = s.next();
		
		System.out.print("패스워드 입력 > ");
		String password = s.next();
		
		boolean login = m.login(id, password);
		
		if(login) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("ID나 password가 올바르지 않습니다.");
		}
		s.close();
	}//main

}

