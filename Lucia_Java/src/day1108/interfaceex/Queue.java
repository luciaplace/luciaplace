package day1108.interfaceex;

public interface Queue {
	void enQueue(String title);//맨 마지막에 데이터 추가
	String deQueue();//맨 처음 항목 반환
	int getSize(); // 전체 갯수
}
