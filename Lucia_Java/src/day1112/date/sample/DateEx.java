package day1112.date.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
	
		Date d = new Date();
		System.out.println(d);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
		String now = sdf.format(d);//Date -> String
		System.out.println(now);
		
		
	}

}






