package day1029.oopex;

//인치, 채널, 볼륨, 전원
public class Tv {
	int inch;
	int volume;
	boolean power;
	int channel;//채널은 5 ~ 20번까지만 있음
	
	//setChannel 채널 번호를 입력한다.
	void setChannel(int c) {
		if(5 <= c && c <= 20) {
			channel = c;
		}else {
			System.out.println(c+"는 없는 채널입니다.");
			System.out.println("기존 채널이 유지됩니다.");
		}
		System.out.println("현재 채널은 "+channel+"입니다.");
	}
	//upChannel 채널올리는 버튼
	void upChannel() {
		if(channel+1 > 20) {
			channel = 5;
		}else {
			channel++;
		}
		System.out.println("현재 채널은 "+channel+"입니다.");
	}
	//downChannel 채널 내리는 버튼
	void downChannel() {
		if(channel - 1 < 5 ) {
			channel = 20;
		}else {
			channel--;
		}
		
		System.out.println("현재 채널은 "+channel+"입니다.");
	}
	//power 전원 버튼을 누른다.
	void power() {
			power = !power;
	}
}