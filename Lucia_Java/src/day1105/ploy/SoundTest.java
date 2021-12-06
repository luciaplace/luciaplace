package day1105.ploy;


import java.util.Scanner;

public class SoundTest {
	public static void main(String[] args) {

		Human human = new Human();
		Cat cat = new Cat();
		Dog dog = new Dog();

		System.out.print("동물의 종류를 입력하세요(사람/개/고양이) > ");
		Scanner scan = new Scanner(System.in);
		String kind = scan.next();
		Animal animal;
		if (kind.equals("사람")) {
			animal = human;
		} else if (kind.equals("개")) {
			animal = dog;
		} else if (kind.equals("고양이")) {
			animal = cat;
		} else {
			animal = null;
		}
		if (animal != null) {
			animal.sound();
		}else {
			System.out.println("잘못된 동물을 입력했습니다.");
		}
		scan.close();
		
	}
}
