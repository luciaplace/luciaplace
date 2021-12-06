package day1029.oopex;

public class Arithmetic {
	//더하기
		int add(int num1, int num2){
			return num1 + num2;
		}
		//빼기
		int subtract(int n1, int n2){
				return n1 - n2;
		}
		//곱하기
		int multiply(int n1, int n2) {
			return n1 * n2;
		}
		//나누기
		double divide(double n1, double n2){
			double result = 0;
			if(n2 != 0.0) {
				result = n1 / n2;
			}else {
				System.out.println("0.0으로 나누면 안됩니다.");
				result = 0;
			}
			return result;
		}
}
