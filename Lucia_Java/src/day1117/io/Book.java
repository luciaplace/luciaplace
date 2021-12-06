package day1117.io;

import java.util.Objects;

public class Book implements Comparable<Book>{

	
	int number;
	String name;
	String company;
	int price;
	public Book(int number, String name, String company, int price) {
		super();
		this.number = number;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return number == other.number;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return Integer.compare(number,o.number);
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", name=" + name + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
}
