package day1115.lambda;

import java.util.function.IntBinaryOperator;


	public class OperatorLambda {

		private static int[] scores = { 92, 95, 87 };

		public static int maxOrMin(IntBinaryOperator operator) {//IntBinaryOperator인터페이스 구현. 
			int result = scores[0];
			for (int score : scores) {
				result = operator.applyAsInt(result, score);
			}
			return result;
		}

		public static void main(String[] args) {
			int max = maxOrMin((a, b) -> {
				if (a >= b)
					return a;
				else
					return b;
			});
			System.out.println("최대값 : " + max);
			int min = maxOrMin((a, b) -> {
				if (a <= b)
					return a;
				else
					return b;
			});
			System.out.println("최소값 : " + min);

	}

}
