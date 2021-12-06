package day1116.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원하는 문자열을 입력하세요");
		int i; 
		
		try {InputStreamReader isr = new InputStreamReader(System.in);
		while((i= System.in.read()) != -1) {
		//while((i = new inputstreamreader(system.in).read()) !=-1)
		System.out.printf("%c(%d)",(char)i,i);
		}
	}catch (IOException e) {e.printStackTrace();
		// TODO: handle exception
	}

}
}
