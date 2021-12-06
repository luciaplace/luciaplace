package day1104.inheritance;

public class VIPCustomer extends Customer {

	private int agentID;//상담원 아이디
	double saleRatio;//할인율
	
	public VIPCustomer() {
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	}
	
	@Override //물려받은 메서드를 수정해서 사용한다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price * (1-saleRatio));
	}
	
}