package day1103.array;

public class Book {
	private String bookName;
	private String author;
	
	//저장 - 기본생성자, 이름/작가 초기화 생성자	
	public Book() {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	//참조변수(주소) 출력시 해당 객체안에 있는 toString()가 자동 호출,
	//리턴 값을 출력한다.
	//객체안에 저장된 값들을 하나의 문자열로 만들어 주는 작업 
	public String toString() {
		return  bookName + " : " +author;
	}
	
}
