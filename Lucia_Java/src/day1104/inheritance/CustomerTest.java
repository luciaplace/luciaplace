package day1104.inheritance;

public class CustomerTest {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setCustomerID(10010);
		c1.setCustomerName("이순신");
		c1.bonusPoint = 1000;
		System.out.println(c1.showCustomerInfo());
		
		System.out.println("==========================");
		
		VIPCustomer v1 = new VIPCustomer();
		v1.setCustomerID(10020);
		v1.setCustomerName("김유신");
		v1.bonusPoint = 10000;
		System.out.println(v1.showCustomerInfo());
	}
}
