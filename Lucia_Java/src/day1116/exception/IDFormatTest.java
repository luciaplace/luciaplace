package day1116.exception;

public class IDFormatTest  {

	
	
	private String userID;
	
	
	
	
	public String getUserID() {
		return userID;
	}




	public void setUserID(String userID)throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다.");
		}else if(userID.length()<8 || userID.length()>20) { throw new IDFormatException("ID 값은 8~20글자 사이로 넣어주세요");
			
		}
		
		this.userID = userID;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest test = new IDFormatTest();
		
		
		try {
		test.setUserID("123456789");} // 조건에 맞는 아이디 입력시 예외 처리 없이 아이디로 저장. 
		catch (IDFormatException e) {System.out.println(e.getMessage());
			// TODO: handle exception
		}try {
		test.setUserID("77"); // 조건에 맞지 않는 아이디 입력시 미리 셋팅해놓은 문구 출
		}catch (IDFormatException e) {System.out.println(e.getMessage());
			// TODO: handle exception
		}System.out.println(test.getUserID()); // 조건에 맞았던 123456789 출력됨. 

	}

}
