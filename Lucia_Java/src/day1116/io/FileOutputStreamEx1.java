package day1116.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("input.txt")) {
			fos.write(65);
			fos.write('B');
			fos.write('d');
			fos.write('한');
			fos.write('글');}
		catch(IOException e) {e.printStackTrace();

		}
		System.out.println("출력완료");
}
}
