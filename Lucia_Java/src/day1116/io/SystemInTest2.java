package day1116.io;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳n 입력 후 [enter]를 누르세요 ");
		
		int i;
		try {
		while((i=System.in.read()) !='\n') { //읽어온 값이 엔터값이 아니라면
			System.out.println((char)i); //한글자 읽어오기 
		}
		}catch (IOException e) { e.printStackTrace();
			// TODO: handle exception
		}
	}

}

