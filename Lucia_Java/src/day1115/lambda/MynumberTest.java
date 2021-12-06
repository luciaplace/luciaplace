package day1115.lambda;

public class MynumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // @오버라이딩임.
		Mynumber max = (int i, int j) -> {return i>= j? i:j ;}; 
		//마이넘버 인터페이스 타입max 로 마이넘버 인터페이스의 메서드를 오버라이딩하여 실행
		//즉 Mynumber를 구현한 객체가 생성됨.
		//화살표가 보이면 람다식이므로 저장 타입을 찾아야함. 

		
	System.out.println(max.getMax(10, 20)); // 오버라이딩 한 메서드 사용시 방법.
	}

}
