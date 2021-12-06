package day1116.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFG";
		try(FileOutputStream fos = new FileOutputStream("output2.txt",true)){
			fos.write(str.getBytes());}catch(IOException ie) { ie.printStackTrace();
	}
		System.out.println("출력완");

}

}