package day1029.oopex;


	public class Car {
		int speed;
		String carNumber;
		String model;
		String color;

		// 가속한다. drive 속도를 입력받아(매개변수에 저장) 기존 속도를 올린다.
		void drive(int s) {
			speed += s;
		}

		// 감속한다. slow 속도를 입력 받아 속도를 낮춘다.
		void slow(int s) {
			if ((speed - s) >= 0) {
				speed -= s;
			} else {
				speed = 0;
			}
		}

		// 정지한다. stop 속도를 0으로
		void stop() {
			speed = 0;
		}
		//getModel 자동차 모델명을 리턴하세요. 
		String getModel(){
			return model;
		}
	}
