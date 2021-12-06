package day1112.date.sample;

import java.util.TimeZone;

public class TimeZoneTest {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String zone : availableIDs) {
			System.out.println(zone);
		}

	}

}
