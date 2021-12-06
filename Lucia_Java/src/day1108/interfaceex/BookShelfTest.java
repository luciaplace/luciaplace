package day1108.interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelf = new BookShelf();
		shelf.enQueue("달러구트");
		shelf.enQueue("두잇");
		shelf.enQueue("spring");
		
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		
	}

}