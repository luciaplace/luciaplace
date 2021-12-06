package day1105.ploy;

public class Shopping {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer com = new Computer();
		
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
		System.out.println("현재 보너스포인트는 "+b.bonusPoint+"점 입니다.");
		
		
	}

}