package day1103.array;


//책들을 저장
public class BookStore {
	public static void main(String[] args) {
		//main에서는 객체 생성과 객체 안에 있는 메서드 호출작업을 한다.
		Book[] store = new Book[5];
		
		store[0] = new Book("The Having", "이서윤");
		store[1] = new Book("돈의 속성", "김승호");
		store[2] = new Book("아몬드", "손원평");
		store[3] = new Book("하버드", "정주영");
		store[4] = new Book("인생은 실전이다", "이서윤");
		
		BookSearch bs = new BookSearch();
		bs.search(store);
	
	}
}
