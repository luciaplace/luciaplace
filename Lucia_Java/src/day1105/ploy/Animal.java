package day1105.ploy;

public class Animal extends Object{

	String name;
	int age;
	
	public Animal() {
		super();
	}
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void sound() {
		System.out.println("동물이 웁니다.");
	}
	
}
