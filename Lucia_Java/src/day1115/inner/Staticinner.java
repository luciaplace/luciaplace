package day1115.inner;

public class Staticinner {


	int a = 10;
	private int b = 100;
	static int c = 200;
		
static class Inner{ // 이너클래스 
		
	//static int d = 1000; 바로 에러가 나는것을 확인할 수 있다. 
	// 만약 이너클래스 안에 static 멤버가 있는경우 반드시 이너클래스명 에도 static을 붙여서 메모리에 올려야한다. 
	// static class Inner{
	//static int d = 1000; } <-이렇게 하면 에러가 안난다. 
	
 static int d = 1000;
	
	public void printData() {
		//System.out.println("Int a:"+a);
		//System.out.println("private int b :"+b);
		System.out.println("static int c :"+c);  // static이 먼저 메모리에 올라가므로 사용이 가능하다.
			
	
	
	
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Staticinner.Inner inner = new Staticinner.Inner();
		inner.printData();
		
	}

}
}

