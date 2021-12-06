package day1115.exception;

public class ExceptionEx2 {

	public void setData(String n) throws NumberFormatException {
		if (n.length()>=1) { //빈 문자열이 아니라
			String str = n.substring(0,1); //0번에서 1번인덱스까지 잘라낸다. 
			printData(str); //잘라낸 데이터를 printData에 넘겨준다. 
			
			
		}
	}
	
	
	
	
	
	//현재 메서드는 try-catch 가 없어서 예외처리 하지 않음.
	//예외가 발생하면 호출한 곳으로 되던져서 그 곳에서 처리한다.
	public void printData(String n)throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan+"단");
	 for (int i = 0; i < 10; i++) {System.out.printf("%d*%d = %d", dan, i,(dan*i));
		
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx2 ex = new ExceptionEx2();
		try {
		ex.setData("삼");
		}catch(NumberFormatException ne) {
			System.err.println(ne.getMessage());
			System.out.println("예외처리");
		}
		System.out.println("Program end!");
		

	}

}
