package day1116.exception;

public class ThrowEx {
	public void methodA(String [] n) throws Exception {
		if (n.length>0) {
			for (String s : n) {System.out.println(s);
				}
		}else {throw new Exception("전달받은 argumen값 없음");
			}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ThrowEx ex = new ThrowEx();
	
	try {ex.methodA(args);
	}catch(Exception e) {System.out.println(e.getMessage());
	e.printStackTrace();}
	}

}
