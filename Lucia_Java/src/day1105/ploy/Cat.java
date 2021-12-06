package day1105.ploy;

public class Cat extends Animal{
	
	String hairColor;

	@Override
	public void move() {
		System.out.println("고양이는 사람이 들고 다닙니다.");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}