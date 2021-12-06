package day1103.array;

import java.util.Scanner;

public class BookSearch {

	public void search(Book[] store) {
		// 스캐너를 통해 작가 이름 입력시 해당 작가의 책 이름을 출력하세요.
		// 입력한 값.equals(book.getAuthor())
		// 해당 작가가 없는 경우 "책이 없습니다."출력
		boolean empty = true; // true : 작가 없음. false : 작가의 책 있음
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 작가 이름을 입력하세요");
		String name = scan.next();
		System.out.println(name + "작가의 책");
		for (Book b : store) {
			if (name.equals(b.getAuthor())) {
				System.out.println(b.getBookName());
				empty = false;
			}
		}
		if (empty) {
			System.out.println("책이 없습니다.");
		}
		scan.close();
	}	

}
