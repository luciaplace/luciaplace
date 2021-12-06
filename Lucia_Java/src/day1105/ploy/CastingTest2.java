package day1105.ploy;


public class CastingTest2 {
	public static void main(String[] args) {
		
		Car car = new Car();
		Car f = new FireEngine();
		
		if(f instanceof FireEngine) {
			FireEngine fe = (FireEngine)f;
			fe.water();
		}
	
		if (car instanceof FireEngine) {
			 FireEngine fe = (FireEngine)car;
			 fe.water();
		}else {
			System.out.println("변환 불가");
		}
		
		
	
		 
		 
	}

}
