package day1108.abstractex;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크탑 display()");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑 typing()");
	}

}
