package day1115.random;


import java.util.*;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = (int)(Math.random()*100)+1;
		System.out.println(num1);

		Random r = new Random();
		int num2 = r.nextInt(100); // 범위를 적어준다. 100을 넣은경우 0-99까지중에 랜덤값 지정. int 값으로 발생된다. 
		System.out.println(num2);
		
	}

}
