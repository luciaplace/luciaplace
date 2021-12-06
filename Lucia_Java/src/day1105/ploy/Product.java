package day1105.ploy;

public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = price / 10;
	}
}
