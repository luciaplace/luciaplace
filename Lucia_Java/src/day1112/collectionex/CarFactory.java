package day1112.collectionex;

import java.util.HashMap;

public class CarFactory {

	private static CarFactory cf = new CarFactory();
	private CarFactory(){}
	
	public static CarFactory getInstance() {
		 if(cf == null) {
			 cf = new CarFactory();
		 }
		 return cf;
	}
	//name - key : value - Car
	HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}else {
			Car car = new Car(name);
			carMap.put(name, car);
			return car;
		}
	}
	
	
}








