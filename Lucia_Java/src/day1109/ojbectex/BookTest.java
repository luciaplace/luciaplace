package day1109.ojbectex;

class Book extends Object {
	String title;
	int bookPrice;

	public Book(String title, int bookPrice) {
		super();
		this.title = title;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [����=" + title + ", ����=" + bookPrice + "]";
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	//å�� �̸��� ������ ���� å�̴�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return title.equals(((Book)obj).title);
		}
		return false;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("����", 10000);
		Book b2 = new Book("����", 8000);
		if(b1.equals(b2)) {
			System.out.println("b1�� b2�� �����ϴ�.");
		}else {
			System.out.println("b1�� b2�� �ٸ��ϴ�.");
		}
		System.out.println(b1.toString());
	}

}
