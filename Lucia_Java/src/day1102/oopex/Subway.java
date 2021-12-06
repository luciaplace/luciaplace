package day1102.oopex;

public class Subway {
	String lineNumber; //지하철노선
	int count; //승객수
	int income; //수입액
	int charge; //지하철 요금

//	지하철 노선과 요금을 저장한다.(생성자)
	public Subway(String lineNumber, int charge) {
		this.lineNumber = lineNumber;	
		this.charge = charge;
	}
//	승객을 태운다.
	public void take() {
		income += charge;
		count++;
	}
//	지하철 상태를 출력한다.
	public void showInfo() {
		System.out.printf("%s노선의 승객은 %d명이고 수입은 %d입니다."
				,lineNumber,count,income);
	}
}
