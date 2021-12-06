package day1115.stream;

import java.util.Arrays;

public class IntArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr [] = {1,2,3,4,5,6};
			
			int sumVal = Arrays.stream(arr).sum();
			
			int count = (int)Arrays.stream(arr).count(); // long 타입 이므로 int 로 캐스팅하기.
			
			
			
			
			System.out.println(sumVal);
			System.out.println(count);
			
			int sumVal2 = Arrays.stream(arr).reduce(0, (a,b) ->a+b);
			System.out.println(sumVal2);

	}
	}
