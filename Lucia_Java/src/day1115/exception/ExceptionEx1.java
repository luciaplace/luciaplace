package day1115.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = new int [3];
	
		for (int i = 0; i <= arr.length; i++) { 
			try {
			arr[i] = i;
			System.out.println(arr[i]);}
		 catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();//예외 추적 메서드 
		}finally {System.out.println("finally"+i);}
	}	
	System.out.println("프로그램 종료");	
		}
}
	
		
	

