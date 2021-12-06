package day1116.exception;

public class PasswordExceptionTest {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {throw new PasswordException("패스워드는 공백일 수 없습니다. ");
		}else if(password.length()<5) {throw new PasswordException("비밀번호는 5자 이상입니다.");}//길이가 5보다 작을경우 
		else if(password.matches("[a-zA-z]+")) {throw new PasswordException("패스워드는 숫자를 포함해야 합니다."); //문자만 가지고 있다면 
		
		}
	this.password=password;
	}
	
	

	


public static void main(String[]args) {
	
	PasswordExceptionTest test = new PasswordExceptionTest();
	try {test.setPassword(null);
		
	} catch (Exception e) {System.out.println(e.getMessage());
		// TODO: handle exception
	}try { test.setPassword("dsfd");
		
	} catch (Exception e) {System.out.println(e.getMessage());
		// TODO: handle exception
	} 
}

	}
