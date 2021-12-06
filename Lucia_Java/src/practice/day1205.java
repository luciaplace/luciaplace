package practice;

import java.util.Scanner;

public class day1205 {
	public static void main(String args[]) {

		// 1,2,3,4,5,6,7,8,9를 출력하는 자바 프로그램을 완성하라.
	for (int i = 1; i < 10; i++) {
			System.out.println(i + " ");
		}

		// 두 정수를 입력받아 합을 구하여 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int b = sc.nextInt();

		int result = a + b;

		System.out.println("두 정수의 합은" + result + "입니다.");

		// 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50,50) (100,100) 두 점으로 이루어진 사각형이 있다고 하자.
		// 한 점을 구성하는 정수 x,y 값을 입력받고 점 (x,y) 가 이 직사각형 안에 있는지 판별하는 프로그램을 작성하라.

		Scanner scan = new Scanner(System.in);
		System.out.println("x의 값을 입력하세요.");
		int x = scan.nextInt();

		System.out.println("y의 값을 입력하세요.");
		int y = scan.nextInt();

		if (x <= 100 && x >= 50) {
			if (y <= 100 && y >= 50) {
				System.out.println("점 x,y는 직사각형 안에 있습니다.");
			} 
			}else {
				System.out.println("점 x,y는 직사각형 안에 없습니다.");

		}
		scan.close();
		

		// 돈의 액수를 입력받아 5만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전 각각 몇개로
		// 변환되는지 출력하라.
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int price = sc1.nextInt();
		/*
		int a = price/50000;
		int b = price%50000;
		int c = b/10000;
		int d = b%10000;
		int e = d/1000;
		int f = d%1000;
		int g = f/500;
		int h = f%500;
		int i = h/100;
		int j = h%100;
		
		System.out.println(price +"는 50000원짜리"+a+"개와 10000원짜리"+c+"개, 1000원짜리"+e+"개, 500원짜리"+g+"개, 100원짜리"+
		i+"개로 이루어져 있습니다.");
		*/
		

		// 학점이 A,B 이면 "execellent" C,D이면 "Good" F일 경우 "BYE"를 출력하는 프로그램을 작성하라.

		// 사칙연산을 입력받아 실행해주는 프로그램을 작성하라. 피 연산자는 모두 실수이다.

		// 두 사람이 하는 가위바위보 게임을 만들어보자. 두사람의 이름은 철수와 영희이다. 먼저 철수를 출력하고 가위, 바위, 보중 하나를 문자열로
		// 입력받는다.
		// 영희도 마찬가지로 입력받고. 두사람으로부터 문자열을 입력받은 후 누가 이겼는지 판별하여 승자를 출력한다.

		// 영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램을 작성하라.

		// 정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 출력하는 프로그램을 작성하라.

		// 정수를 입력받아 짝수이면 짝, 홀수이면 홀 을 출력하는 프로그램을 작성하라. 만약 사용자가 정수를 입력하지 않는 경우에는 프로그램을
		// 종료하라.

		// 영어와 한글이 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어단어를 입력받아 뜻을 출력하는 프로그램을 작성하라. 또한 "exit"를
		// 입력하면 프로그램을 종료하라.

	}

}
