package day1108.interfaceex;
interface InterEx1{
	public int getA();
}
interface InterEx2{
	public int getA();
}
//상속받은 추상 메서드를 오버라이딩 하면 안됨!!!
interface InterEx3 extends InterEx1, InterEx2{
	public int getData();
}


public class InterTest2 extends Object implements InterEx3{
	int a = 100;
	@Override
	public int getA() {
		return a;
	}
	@Override
	public int getData() {
		return a  + 10;
	}
	public static void main(String[] args) {
		InterTest2 it = new InterTest2();
		InterEx1 i1 = it;
		InterEx2 i2 = it;
		InterEx3 i3 = it;
		System.out.println(i1.getA());
		System.out.println(i2.getA());
		System.out.println(i3.getA());
		System.out.println(i3.getData());
		
	}
}