package day1112.date.sample;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		//set add roll
		Calendar cal = Calendar.getInstance();
		
		cal.set(2021, 7, 31); // 2021/8/31
		printDate(cal);
	
		System.out.println("1일 후");
		cal.add(Calendar.DATE, 1);
		printDate(cal);
		
		System.out.println("6개월 후");
		cal.add(Calendar.MONTH, -6);
		printDate(cal);
		
		System.out.println("31일 후");
		cal.roll(Calendar.DATE, 31);
		printDate(cal);
	}
	
	public static void printDate(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %d월 %d일\n\n", year,month,date);	
	}
	

}
