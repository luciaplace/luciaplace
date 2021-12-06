package day1102.oopex;

public class GotoSchool {
	public static void main(String[] args) {
//		지하철 2호선의 요금은 1250원이고 //line2
		Subway line2 = new Subway("2", 1250);
//		100번 버스의 요금은 1000원이다. //no100
		Bus no100 = new Bus(100, 1000);
//		200번 버스의 요금은 2000원이다. //no200
		Bus no200 = new Bus(200, 2000);
//		1학년 Jerry의 용돈은 10000원이고 지하철 탑승 후 100번 버스를 타고 학교에 간다.(환승따윈 없다.)
		Student jerry = new Student("Jerry", 1, 10000);
		jerry.takeSubway(line2);
		jerry.takeBus(no100);
//		2학년 Tom의 용돈은 15000원이고 200번 버스만 타고 학교에 간다.
		Student tom = new Student("Tom", 2, 15000);
		tom.takeBus(no200);
		
//		학교에 도착 후 두 사람의 용돈은 얼마가 남았는지 출력하시오.
		jerry.show();
		tom.show();

	}


}
