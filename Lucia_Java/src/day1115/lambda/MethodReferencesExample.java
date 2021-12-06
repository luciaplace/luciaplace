package day1115.lambda;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조 ---------------------------------
		operator = (x, y) -> Calculator.staticMethod(x, y); // static method니까 클래스명.메소드명 
		System.out.println("결과1: " + operator.applyAsInt(1, 2));

		operator = Calculator :: staticMethod; // 줄여서 쉽게 쓰는법 
		System.out.println("결과2: " +  operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조 ---------------------------
		Calculator obj = new Calculator(); //인스턴스 메서드를 쓰기위해 객체 생성.
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));

		operator = obj :: instanceMethod;// obj의 메서드 중에 instanceMethod이름의 2개의 int 타입을 매개변수로 받는 메서드를 찾아라 
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}
}