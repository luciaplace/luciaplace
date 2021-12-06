package day1102.oopex;

public class Bus {


	int busNumber;//버스번호
	int charge;//요금
	int income;//버스 수입
	int count;//버스 승객 수
	
	public Bus(int busNumber,int charge) {
		this.busNumber = busNumber;
		this.charge = charge;
	}
	//승객을 태운다.
	public void take() {
		income += charge;
		count++;
	}
	//버스 상태를 출력한다.
	public void showInfo() {
		System.out.printf("%d번 버스의 승객은 %d명이고 수입은 %d입니다."
				,busNumber,count,income);
	}
}

