package day1115.inner;
//아우터 클래스 
public class MemberInner {

	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//이너클래스는 아우터 클래스의 멤버를가져다 쓸수 있는 장점이 있다. 
	
	class Inner{ // 이너클래스 
		
		public void printData() {
		System.out.println("Int a:"+a);
		System.out.println("private int b :"+b);
		System.out.println("static int c :"+c);  // static이 먼저 메모리에 올라가므로 사용이 가능하다.
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MemberInner outter = new MemberInner();
	MemberInner.Inner inner = outter.new Inner(); // 내부클래스를 객체로 만드는 방법. 반드시 아우터 클래스가 객체가 된 후 객체로 만들어질 수 있다. 
	// 이너클래스는 자신을 감싸고 있는 아우터클래스가 객체가 된 후에야 메모리에 올라갈 수 있다. 
	// static 의 경우 처음부터 메모리에 올라가야하므로 인스턴스 이너클래스에는 static 멤버는 선언이 불가하다. 
	//MemberInner.Inner inner = new MemberInner().new Inner(); //똑같이 객체 만드는 방법.

	inner.printData();
	
	}

}
