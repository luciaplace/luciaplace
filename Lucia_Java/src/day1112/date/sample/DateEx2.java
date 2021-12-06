package day1112.date.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//String -> Date -> Calendar
//Calendar -> Date -> String
public class DateEx2 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜를 입력하세요 yyyy/MM/dd");
		
		String input = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date i_date = sdf.parse(input);//String -> Date
		
		Calendar c = Calendar.getInstance();
		c.setTime(i_date);//Date -> Calendar
		
		Calendar today = Calendar.getInstance();
		
		long diff = Math.abs(c.getTimeInMillis() - today.getTimeInMillis());
		long day = diff/(1000*60*60*24);
		
		System.out.println(day+"일 차이가 납니다.");

		scan.close();
		
	}

}
