package day1112.date.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Calendar -> Date -> String
public class DateEx3 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜를 입력하세요 yyyy/MM/dd");
		
		String input = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date i_date = sdf.parse(input);//String -> Date
		
		Calendar c = Calendar.getInstance();
		c.setTime(i_date);//Date -> Calendar
		
		c.add(Calendar.MONTH, 6);
		
		Date d  = new Date(c.getTimeInMillis()); // Calendar -> Date
		String after6 = sdf.format(d);
		System.out.printf("%s의 6개월 후는 %s입니다.",input,after6);
		
		scan.close();
		
	}

}
