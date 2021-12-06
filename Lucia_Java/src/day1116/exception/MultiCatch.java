package day1116.exception;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int a = Integer.parseInt(args[0]);
		int result = 100/a;
	System.out.println("result :: "+ result);
	
	}catch (ArrayIndexOutOfBoundsException  as) {System.out.println("arguement값을 넣어주세요.");
	}catch (NumberFormatException a) {System.out.println("숫자만 입력해주세요");
		// TODO: handle exception
	}catch (ArithmeticException s) {System.out.println("0금지 ");
		// TODO: handle exception
	}catch(Exception e) {System.out.println("예외가 발생하였습니다."); //멀티플 캐치문 사용시 슈퍼클래스는 맨 아래에 기재하기
	} System.out.println("프로그램 종료");

}
}
