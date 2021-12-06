package day1115.inner;

public class MyRunnable {
	//익명 이너클래스 

	Object o1 = new Object() {
		void method() {}};
		static Object cv = new Object() {void method(){}};
		void method() {
			Object iv = new Object() {
				void method() {}
			};
		}

}
