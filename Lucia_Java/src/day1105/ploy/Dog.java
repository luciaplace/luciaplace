package day1105.ploy;

public class Dog extends Animal {
	String kind;

	@Override
	public void move() {
		System.out.println("개는 네발로 뛰어다닙니다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}