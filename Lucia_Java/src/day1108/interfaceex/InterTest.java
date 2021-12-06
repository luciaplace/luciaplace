package day1108.interfaceex;


interface Inter1{
	int A = 100; // public final static 생략 가능
	int getA(); //	public abstract 생략 가능	
}

public class InterTest implements Inter1{
	@Override
	public int getA() {
		return A;
	}
	public static void main(String[] args) {
		Inter1 it = new InterTest();
		System.out.println("getA() : " + it.getA());
	}
}
