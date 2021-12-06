package day1116.exception;

public class PasswordException extends IllegalArgumentException { //적합하지 않거나 적절하지 못한 인자를 메소드에 넘겼을 경우 
	
	private static final long serialVersionUID = 1L;
	
	public PasswordException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
		

}
