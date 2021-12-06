package day1108.abstractex;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump아직 못해요...");
	}

	@Override
	public void turn() {
		 System.out.println("turn도 아직...");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자 레벨입니다.");

	}

}