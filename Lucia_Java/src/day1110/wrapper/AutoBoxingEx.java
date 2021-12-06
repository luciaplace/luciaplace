package day1110.wrapper;

public class AutoBoxingEx {
	public static void main(String[] args) {
		int i = 10;
		
		
		Integer intg = i; //Integer intg = Integer.valueOf(i);
		Object o = i; //Object o = (Object)Integer.valueOf(i);
		
		Long lng = 100L; // Long lng  = new Long(100L);
		
		int i2 = intg + 10; //�������� �⺻�� ���� ���� ����
		long l = lng + intg; //wrapper ��ü���� ���� ����
		//unboxing
		int i3 = intg; // int i3 = intg.intValue();
		
		int i4 = 100;
		long l4 = i4;
		
		Integer i5 = 100;
		//Long l5 = i4; 
		//Long l6 = i5; 
		
	}
}



