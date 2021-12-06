package day1102.oopex;

public class Student {
	String name;//	이름
	int grade;//	학년
	int money;//	용돈

//	학생 정보 저장(생성자)
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
//	버스를 탄다. 
	public void takeBus(Bus bus) {
		System.out.println(name+"이 "+bus.busNumber+"버스에 탑승함.");
		money -= bus.charge; // 요금 지불
		bus.take();//버스에 승객으로 탑승
		
	}
//	지하철을 탄다 takeSubway
	public void takeSubway(Subway subway) {
		System.out.println(name+"이 지하철을 탑승함.");
		money -= subway.charge;
		subway.take();
	}
	
//	남은 용돈을 출력한다.
	public void show() {
		System.out.printf("%s의 용돈이 %d만큼 남았습니다.\n",name,money);
	}
}


