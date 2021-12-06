package day1112.date.sample;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		//Calendar cal = Calendar.getInstance(); //GregorianCalendar�� ��ü ����

		TimeZone timeZone = TimeZone.getTimeZone("America/Chicago"); //미국 시카고에 맞춘 시간대 
		Calendar cal = Calendar.getInstance(timeZone);
		
		int year = cal.get(Calendar.YEAR); //연도 가져오기 
		int month = cal.get(Calendar.MONTH)+1; // 월은 0 부터 시작하니깐 1더하기 해줘야함	 // 월 가져오기
		int date = cal.get(Calendar.DAY_OF_MONTH); // 일 가져오기 
		
		System.out.printf("%d년 %d월 %d일 ", year,month,date);
	
		int hour = cal.get(Calendar.HOUR); // 시 가져오기 
		int minute = cal.get(Calendar.MINUTE); // 분 가져오기 
		int second = cal.get(Calendar.SECOND);//초 가져오기 
		System.out.printf("%d시 %d분 %d초 ", hour,minute,second);
		
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.AM) { //ampm변수값이 am시간대와 같다면 
			System.out.println("am"); // am으로 표기하라 
		}else {
			System.out.println("pm"); // 아니라면 pm으로 표기하라 
		}
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if(week == Calendar.SUNDAY) {
			System.out.println("일요일");
		}else if(week == Calendar.MONDAY) {
			System.out.println("월요일");
		}else if(week == Calendar.TUESDAY) {
			System.out.println("화요일");
		}else if(week == Calendar.WEDNESDAY) {
			System.out.println("수요일");
		}else if(week == Calendar.THURSDAY) {
			System.out.println("목요일");
		}else if(week == Calendar.FRIDAY) {
			System.out.println("금요일");
		}else if(week == Calendar.SATURDAY) {
			System.out.println("토요일");
		}
		
		
		
		
		
	}

}







