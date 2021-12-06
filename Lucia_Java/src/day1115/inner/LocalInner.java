package day1115.inner;

public class LocalInner {

	int a = 100; //멤버변수 
	public void innerTest(int k) {
		int b = 200;
		final int c = k;
		
		class Inner{
			public void printData() {System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			System.out.println("c : "+ c); 
			
			a=200;
			//b=300; // 지역변수는 메서드가 호출될 때 메모리에 올라가고 메서드가 사라질때 없어진다.
			//local inner class에서 지역변수는 상수가 된다. 따라서 새로운 값을 저장 할 수 없다.  
			System.out.println("a : "+a);
			//System.out.println("b : "+b);
			}
		}
		Inner i = new Inner();
		i.printData();
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner li = new LocalInner();
		li.innerTest(1000);

	}

}
