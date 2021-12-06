package day1115.stream;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer customerLee = new TravelCustomer("이순신",40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신",20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동",13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerHong);
		customerList.add(customerKim);
		customerList.add(customerLee);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		// 이름을 뽑아서 정렬한다. 
		
		
		int total = customerList.stream().mapToInt(c ->c.getPrice()).sum(); //int타입으로 꺼내오는 map to int
		System.out.println("총 여행비용은 :"+ total +"입니다.");
		// 고객 리스트에서 금액을 뽑아 더해 출력한다. 
		
		
		System.out.println("===20세 이하 고객명단 정렬하여 출력===");
		customerList.stream().filter(c->c.getAge()>= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		// 필터로 20세 이하고객을 추출하여 그중 이름을 정렬하여 출력한다.
		
	
	}

}
