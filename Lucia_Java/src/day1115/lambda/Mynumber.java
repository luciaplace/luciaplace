package day1115.lambda;
@FunctionalInterface // 이거 붙였을때 에러 안나면 람다식 적용 가능 

public interface Mynumber { //추상메서드가 하나만 있는 인터페이스
	
	int getMax(int i, int j); //  람다식으로 처리 할 수 있는 조건  
	//int getMin(int i, int j); <-이 메서드 적는 즉시 @FunctionalInterface 에러남. 

}
